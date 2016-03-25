package homework008.java;

import homework008.SpringConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.net.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.*;

@Component
public class Server {

    public void run() {
//	Массив слов
        ArrayList<String> words = new ArrayList();
        try {
//	Порт
            int serverPort = 4024;
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
            Scanner in = new Scanner(new FileReader("/Users/rubenahmadiev/IdeaProjects/AbramskiySpringHomeWork/src/homework008/resources/words.txt"));
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
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        Server srv = ac.getBean(Server.class);
        srv.run();
    }
}