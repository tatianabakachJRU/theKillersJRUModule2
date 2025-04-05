package lecture_17.reflection_2;

public class Dragon {
    private String name;

    public Dragon(String name) {
        this.name = name;
    }

    public Dragon() {
        name = "Default Name";
    }

    public String getName() {
        return name;
    }
}
