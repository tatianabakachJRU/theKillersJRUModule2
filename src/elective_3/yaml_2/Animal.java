package elective_3.yaml_2;

public class Animal {
    private String name;
    private double weight;
    private int max_count_per_cell;
    private String max_speed;
    private String food_needed;

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getMax_count_per_cell() {
        return max_count_per_cell;
    }

    public String getMax_speed() {
        return max_speed;
    }

    public String getFood_needed() {
        return food_needed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", max_count_per_cell=" + max_count_per_cell +
                ", max_speed='" + max_speed + '\'' +
                ", food_needed='" + food_needed + '\'' +
                '}';
    }
}
