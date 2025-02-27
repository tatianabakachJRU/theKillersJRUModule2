package lecture_6;

import java.util.function.Consumer;

public class MethodReferenceExample_6 {
    public static void main(String[] args) {
        InstanceMethodExample instanceMethodExample = new InstanceMethodExample();
        Consumer<String> printMessage =
                instanceMethodExample::printMessage;
        printMessage.accept("Hello");
    }
}

class InstanceMethodExample{
    void printMessage(String message){
        System.out.println(message);
    }
}
