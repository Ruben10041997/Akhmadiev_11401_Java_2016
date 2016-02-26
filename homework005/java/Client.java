package abramskiy.homework005.java;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    public void run() {
//	Строка для отправки на сервер
        String lineTo;
//	Строка для приема от сервера
        String lineFrom;
//	секретное слово
        String word;
//	Очки Игрока
        int points = 10;
//	Переменная булевского типа что бы знать в игре ли Игрок(Gamer)
        boolean inGame;
//	Массив уже введенных букв
        ArrayList<String> enteredChars = new ArrayList<>();
        try {
//	Порт
            int serverPort = 4022;
//	Адрес сервера
            InetAddress host = InetAddress.getByName("localhost");
            System.out.println("Добро пожаловать в Игру \"Виселица\"! ");

//	Подключение к серверу
            Socket socket = new Socket(host,serverPort);
//Socket socket = new Socket("127.0.0.1", serverPort);
            System.out.println("Вы подключились к серверу Игры! Для выхода из Игры введите \"Выйти\"");

//	Инициализация PrintWriter и BufferedReader и Scanner.in
            PrintWriter toServer = new PrintWriter(socket.getOutputStream(),true);
            BufferedReader fromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            Scanner in = new Scanner(System.in);

//	Получение секретного слова с сервера
            word = fromServer.readLine();
            System.out.println("Слово - " + word);
            inGame = true;

            while(true){
                if (inGame) System.out.print("Введите букву: ");
                if(in.hasNext()){
                    lineTo = in.next();
                    if(lineTo.equals("Выйти")){
//Выходит из программы если Игрок ввел "Выйти"
                        break;
                    }
                    if(inGame){
                        if(lineTo.length() != 1)
//	Выписываем ошибку если Игрок ввел больше 1-го сивола во время игры
                            System.out.println("Неверные данные!!! Вы можете вводить только по одной букве!");
                        else if(enteredChars.contains(lineTo))
//	Выписываем ошибку если Игрок ввел повторяющийся символ
                            System.out.println("Вы уже вводили букву \"" + lineTo + "\"");
                        else if(lineTo.length() == 1){
//	Записываем введеный символ в массив веденных символов
                            enteredChars.add(lineTo);
//	Отправляем символ на сервер для проверки
                            toServer.println(lineTo);
//	Считываем что прислал нам сервер
                            lineFrom = fromServer.readLine();
                            if(lineFrom.equals("No!")){
//	Если нет совпадений, отнимаем очки Игрока
                                System.out.println("Нет совпадений!");
                                points--;
                                System.out.println("Ваши очки: " + points);
                                if (points == 0) {
                                    System.out.println("Вы проиграли...");
                                    break;
                                }
                            }else if(lineFrom.contains("Yes!")){
//	Если есть совпадение
                                System.out.println("Есть совпадение! Слово: " + lineFrom.replace("Yes!", ""));
                            }else{
//	Если слово отгадано
                                System.out.println("Слово отгадано: " + lineFrom);
                                System.out.println("Продолжаем Да/Нет");
                                inGame = false;
                            }
                        }
                    } else {
                        if(lineTo.equals("Да")){
//	Если Игрок хочет продолжать играть
                            toServer.println("Да");
                            word = fromServer.readLine();
                            System.out.println("Слово - " + word);
                            inGame = true;
                            enteredChars.clear();
                            points = 10;
                        }
                        else if(lineTo.equals("Нет"))
//	Если Игрок Не хочет продолжать играть
                            break;
                        else
//	Если Игрок не ввел Нет или Да
                            System.out.println("Некорректная команда!");
                    }
                }
            }
            System.out.println("До встречи!");
            toServer.close();
            fromServer.close();
            socket.close();
        }
        catch(UnknownHostException ex) {
            ex.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }
}
