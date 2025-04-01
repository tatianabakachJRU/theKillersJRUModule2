package elective_2.enums;

// enum для типов единорогов
public enum UnicornType {
    RAINBOW("Радужный"),
    CRYSTAL("Кристальный"),
    GOLDEN("Золотой"),
    SHADOW("Теневой"),
    FOREST("Лесной");

    private final String description;


    UnicornType(String description) {
        this.description = description;
    }


    public static UnicornType[] getAllTypes(){
        return values();
    }

    @Override
    public String toString() {
        return description;
    }
}
