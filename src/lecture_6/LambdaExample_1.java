package lecture_6;

public class LambdaExample_1 {
    public static void main(String[] args) {
        // параметры метода     лямбда-оператор    тело метода
        //()                     ->               {}

        MyFunctionalInterface functionalInterface
                = () -> System.out.println("Hello The Killers!");

        MyFunctionalInterface_2 functionalInterface2
                = () -> System.out.println("Hello The Killers!");


        functionalInterface.execute();


    }
}
