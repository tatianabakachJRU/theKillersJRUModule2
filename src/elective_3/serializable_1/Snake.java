package elective_3.serializable_1;

import java.io.Serializable;

public class Snake implements Serializable {
    //private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private transient int number;

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
