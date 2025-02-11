package lecture_1.polimorphizm;

public class MyMath {

    private int count;

    public int increment(){
        return count++;
    }

    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public double add(double a, double b){
        return a + b;
    }

    public double add (double a, int b){
        return a + b;
    }

    public double add (int a, double b){
        return a + b;
    }

}
