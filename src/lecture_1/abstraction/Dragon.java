package lecture_1.abstraction;

public class Dragon extends Pet{
    private int age;
    public Dragon(String name) {
        super(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative!");
        }
    }

    @Override
    public void makeSound() {
        System.out.println(name + " say: Roar!!!!");
        privateMethod();
    }

    private void privateMethod(){
        System.out.println("Private Method");
    }
}
