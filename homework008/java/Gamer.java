package homework008.java;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;

public class Gamer extends Thread {
    //Socket для каждого клиента
    protected Socket socket;
    //	Приходящая строка
    String lineFrom;
    //	Уходящая строка
    String lineTo;
    //	Загаданое слово
    String word;
    //	Зашифрованное загадонное слово
    String secretWord = "";
    //	Все слова с Файла
    ArrayList<String> words = new ArrayList();
    //	Класс что был взят случайный элемент с words массива
    Random random = new Random();
    //	Переменная булевского типа что бы знать в игре ли Игрок(Gamer)
    boolean inGame = true;

    //	Конструктор для Игрока
    public Gamer(Socket clientSocket, ArrayList<String> words) {
        this.socket = clientSocket;
        this.words = words;
        getSecretWord();
    }

    //	Получение случайноко слова
    private void getSecretWord() {
        word = words.get(random.nextInt(words.size()));
        secretWord = "";
        for (int i = 0; i < word.length(); i++) {
            secretWord += "*";
        }
    }

    public void run() {
        PrintWriter toClient;
        BufferedReader fromClient;
        try {
//	Инициализация PrintWriter и BufferedReader
            toClient = new PrintWriter(socket.getOutputStream(), true);
            fromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));

//	Отсылаем слово от Игрока
            toClient.println(secretWord);

            while (true) {
//	Считываем слово с клиента
                lineFrom = fromClient.readLine();
                if (lineFrom == null)
                    break;
                if(inGame){ //Если Игрок в Игре
                    if (word.contains(lineFrom)) {
//Если есть совпадение
                        StringBuilder s = new StringBuilder(secretWord);
//	Заменяем '*' на отгаданый символ
                        for (int i = 0; i < word.length(); i++) {
                            if (Character.toString(word.charAt(i)).equals(lineFrom)) {
                                s.setCharAt(i, lineFrom.charAt(0));
                            }
                        }
                        secretWord = s.toString();
                        if (secretWord.contains("*")) {
//	Отсылаем в таком формате, если слово не отгадано до конца
                            toClient.println(secretWord + "Yes!");
                        } else {
//	Отсылаем в таком формате, если слово отгадано до конца
                            toClient.println(secretWord);
                            inGame = false;
                        }

                    } else {
//	Отсылаем в таком формате, если Игрок не отгадал ни одного символа
                        toClient.println("No!");
                    }
                } else {
                    if(lineFrom.equals("Да")){
//	Если Игрок захочет продолжить игру
                        getSecretWord();
                        inGame = true;
                        toClient.println(secretWord);
                    }
                }
// System.out.println("Server received: " + lineFrom);
            }
        } catch (IOException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}