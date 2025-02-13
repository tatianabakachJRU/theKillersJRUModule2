package lecture_2.associations;

import lecture_2.associations.aggregation.Department;
import lecture_2.associations.aggregation.Employee;
import lecture_2.associations.composition.Car;
import lecture_2.associations.composition.Engine;

public class Main {
    public static void main(String[] args) {
        Employee bob = new Employee("Bob");
        Employee helen = new Employee("Helen");
        Employee mike = new Employee("Mike");

        Department sales = new Department("Sales");

        sales.addEmployee(bob);
        sales.addEmployee(helen);

        Engine v8 = new Engine("V8");

        Car car = new Car("RE345");
        // new Engine ("RE345")

        Car car1 = new Car(v8.getType());


        car.printEngineType();
    }
}
