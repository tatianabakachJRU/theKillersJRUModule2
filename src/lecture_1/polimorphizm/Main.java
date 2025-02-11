package lecture_1.polimorphizm;

public class Main {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        System.out.println(myMath.add(2,3));
        System.out.println(myMath.add(2,3));
        System.out.println(myMath.add(2,3));
        System.out.println(myMath.add(2,3));

        System.out.println(myMath.increment());
        System.out.println(myMath.increment());
        System.out.println(myMath.increment());
        System.out.println(myMath.increment());


        myMath.add(2, 3.14);
    }
}
