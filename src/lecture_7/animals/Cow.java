package lecture_7.animals;

public class Cow extends Animal{
    public Cow(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Moo";
    }

    @Override
    public String getType() {
        return "Cow";
    }
}
