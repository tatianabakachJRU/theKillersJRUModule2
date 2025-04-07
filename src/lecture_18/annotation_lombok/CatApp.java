package lecture_18.annotation_lombok;

public class CatApp {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setAge(10);
        System.out.println(cat.getAge());
        System.out.println(cat);
        Cat tom = new Cat("Tom", 29);
        System.out.println(tom);
    }
}
