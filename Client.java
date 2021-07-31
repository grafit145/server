package ru.netology;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {

        String host = "localhost";
        int port = 8282;
//        запускаем блок try с ресурсами, создаём в нём класс Socket, передаём через буффер и поток вывода
//        строку на сервер
        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            out.println("Client message");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
