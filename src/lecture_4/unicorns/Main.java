package lecture_4.unicorns;

public class Main {
    public static void main(String[] args) {
        Unicorn.sayHello();
        Unicorn.listCharacteristics();

        SparkleUnicorn sparkleUnicorn = new SparkleUnicorn();
        MysticUnicorn mysticUnicorn = new MysticUnicorn("Bob");

        sparkleUnicorn.displayInfo();
        sparkleUnicorn.gallop();
        sparkleUnicorn.eat("Magical Herbs");
        sparkleUnicorn.gallop();
        sparkleUnicorn.eat("Magical Herbs");
        sparkleUnicorn.gallop();

        System.out.println("*".repeat(20));

        mysticUnicorn.displayInfo();
        mysticUnicorn.gallop();
        mysticUnicorn.eat("Fruits");
        mysticUnicorn.gallop();


    }
}
