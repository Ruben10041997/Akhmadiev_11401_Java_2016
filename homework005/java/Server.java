package abramskiy.homework005.java;

import java.net.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class Server {
    public void run() {
//	Массив слов
        ArrayList<String> words = new ArrayList();
        try {
//	Порт
            int serverPort = 4022;
            ServerSocket serverSocket = new ServerSocket(serverPort);
//	Заполняем массив слов
            words = readFromFile();
            while (true) {
                System.out.println("Ожидание игроков...");

//	Подключение Игрока(Client)
                Socket server = serverSocket.accept();
                System.out.println("Игрок подключился! ");
//	Создание оьдельного потока(Class-a) для каждого Игрока
                new Gamer(server, words).start();
            }
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //	Записываем слова из файла в Массив
    private ArrayList<String> readFromFile() {
        ArrayList<String> words = new ArrayList();
        try {
            Scanner in = new Scanner(new FileReader("/Users/rubenahmadiev/Desktop/Gallows/src/main/resources/words.txt"));
            while(in.hasNext()){
                words.add(in.next().toLowerCase());
            }
            in.close();
        } catch (FileNotFoundException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
        return words;
    }

    public static void main(String[] args) {
//	Запускаем сервер
        Server srv = new Server();
        srv.run();
    }
}