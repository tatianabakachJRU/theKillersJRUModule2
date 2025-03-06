package lecture_9.getClass;

public class Cat extends Animal{
    private String owner;

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat(String name, int age, String owner) {
        super(name, age);
        this.owner = owner;
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    private void sleep(){
        System.out.println("Cat is sleeping");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "owner='" + owner + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                "} " + super.toString();
    }
}
