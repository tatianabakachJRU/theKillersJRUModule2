package lecture_17.reflection_1;

@Entity("employee_entity")
public class Employee extends Person implements Worked{
    private double height;

    public Employee() {
    }

    public Employee(int id, String name, double height) {
        super(id, name);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
