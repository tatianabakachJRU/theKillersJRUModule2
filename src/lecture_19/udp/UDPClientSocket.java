package lecture_19.udp;

import java.awt.dnd.DragSource;
import java.io.IOException;
import java.net.*;

public class UDPClientSocket {
    public static void main(String[] args) {
        try{
            DatagramSocket datagramSocket = new DatagramSocket();
            System.out.println("Подключаюсь к серверу");

            String message = "Привет, сервер! Это клиент";
            byte[] requestBuffer = message.getBytes();

            DatagramPacket datagramPacket = new DatagramPacket(
                    requestBuffer,
                    requestBuffer.length,
                    InetAddress.getByName("localhost"),
                    12345
            );
            datagramSocket.send(datagramPacket);
            System.out.println("Отправлено серверу: " + message);

            byte[] responseBuffer = new byte[256];
            DatagramPacket responsePacket =
                    new DatagramPacket(responseBuffer, responseBuffer.length);
            datagramSocket.receive(responsePacket);

            String response =
                    new String(responsePacket.getData(), 0, responsePacket.getLength());
            System.out.println("Ответ сервера: " + response);

            datagramSocket.close();

        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
