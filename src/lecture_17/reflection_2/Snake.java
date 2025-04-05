package lecture_17.reflection_2;

public class Snake {
    private String name;
    private int age;

    public Snake() {
        name = "Kaa";
        age = 100;
    }

    public Snake(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Snake{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
