package lecture_19.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPSocketClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345);
            System.out.println("Подключение к серверу");

            PrintWriter output =
                    new PrintWriter(socket.getOutputStream(), true);

            BufferedReader input =
                    new BufferedReader(
                            new InputStreamReader(
                                    socket.getInputStream()));

            String message = "Привет сервер, это клиент!";
            output.println(message);
            System.out.println("Серверу отправлено сообщение: " + message);

            String response = input.readLine();
            System.out.println("Ответ сервера: " + response);

            socket.close();

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
