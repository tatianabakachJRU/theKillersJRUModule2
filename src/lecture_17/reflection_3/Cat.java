package lecture_17.reflection_3;

public class Cat {
    private String name;
    private int age;

    private Cat() {
        name = "Tom";
        age = 5;
    }

    public Cat(String name, int age) {
        this.age = age;
        this.name = name;
    }

    private void meow(){
        System.out.println("Meow! I want to eat!!!!");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
