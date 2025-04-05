package lecture_17.reflection_2;

public class DragonReflectionApp {
    public static void main(String[] args) {
        try{
            Dragon dragon = Dragon.class.newInstance();
            System.out.println(dragon.getName());
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
