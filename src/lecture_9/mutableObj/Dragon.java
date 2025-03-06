package lecture_9.mutableObj;

public final class Dragon {
    private final String name;
    private final int age;

    public Dragon(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Dragon withOldAge (int newAge){
        return new Dragon(this.name, newAge);
    }
}
