package lecture_9.mutableObj;



public class DragonApp {
    public static void main(String[] args) {
        Dragon smaug = new Dragon("Smaug", 200);
        System.out.println(smaug.getName());
        System.out.println(smaug.getAge());

        Dragon dragon = smaug.withOldAge(300);
    }
}
