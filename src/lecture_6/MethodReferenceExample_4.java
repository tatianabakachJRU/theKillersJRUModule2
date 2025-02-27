package lecture_6;

import java.util.function.Consumer;

public class MethodReferenceExample_4 {
    public static void main(String[] args) {
        Consumer<String> printMessage = MethodReferenceExample_4::printMessage;
        printMessage.accept("Hello");
    }

    static void printMessage(String message){
        System.out.println(message);
    }
}
