package elective_3.serializable_1;

import java.io.*;

public class SerializableExample_1 {
    public static void main(String[] args) {
        //serializeSnake();
        deserializeSnake();
    }

    private static void deserializeSnake() {
        try(ObjectInputStream objectInputStream
                    = new ObjectInputStream(new FileInputStream("snake.ser"))) {
            Snake snake = (Snake) objectInputStream.readObject();
            System.out.println("Объект десериализован");
            System.out.println(snake);

        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    private static void serializeSnake() {
        Snake kaa = new Snake("Kaa", 100);

        try(ObjectOutputStream objectOutputStream
                    = new ObjectOutputStream(new FileOutputStream("snake.ser"))) {
            objectOutputStream.writeObject(kaa);
            System.out.println("Объект сериализован и записан в файл snake.ser");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
