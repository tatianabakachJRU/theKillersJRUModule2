package lecture_19.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPSocketServer {
    public static void main(String[] args) {
        try{
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Сервер запущен, ожидается подключение клиента...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Клиент подключен: " + clientSocket.getInetAddress());

            BufferedReader input =
                    new BufferedReader(
                            new InputStreamReader(
                                    clientSocket.getInputStream()));
            PrintWriter output =
                    new PrintWriter(clientSocket.getOutputStream(), true);

            String message = input.readLine();
            System.out.println("Получено сообщение от клиента: " + message);

            output.println("Привет клиент, вот ответ! Я получил твое сообщение: " + message);

            clientSocket.close();
            serverSocket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
