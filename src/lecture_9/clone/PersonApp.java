package lecture_9.clone;

public class PersonApp {
    public static void main(String[] args) {
        try {
            Person alice = new Person("Alice", 30);
            Person clone = (Person) alice.clone();
            System.out.println(alice);
            System.out.println(clone);

            clone.age = 50;
            System.out.println(alice);
            System.out.println(clone);

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }


    }
}
