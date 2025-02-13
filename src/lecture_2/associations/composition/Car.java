package lecture_2.associations.composition;

public class Car {
    private Engine engine;

    public Car(String engineType) {
        this.engine = new Engine(engineType);
    }

    public void printEngineType(){
        System.out.println(engine.getType());
    }
}
