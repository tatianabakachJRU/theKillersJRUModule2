package lecture_19.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServerSocket {
    public static void main(String[] args) {
        try{
            DatagramSocket datagramSocket = new DatagramSocket(12345);
            System.out.println("Сервер запущен, ожидает соединение");

            byte[] buffer = new byte[256];
            while (true){
                DatagramPacket requestPacker = new DatagramPacket(buffer, buffer.length);
                datagramSocket.receive(requestPacker);

                String message =
                        new String(requestPacker.getData(), 0, requestPacker.getLength());
                System.out.println("Получено сообщение от клиента: " + message);

                String response = "Привет клиент! Это сервер. Я получил сообщение: " + message;
                byte[] responseBuffer = response.getBytes();
                DatagramPacket responsePacket = new DatagramPacket(
                       responseBuffer,
                       responseBuffer.length,
                       requestPacker.getAddress(),
                       requestPacker.getPort()
                );

                datagramSocket.send(responsePacket);
                datagramSocket.close();
            }
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
