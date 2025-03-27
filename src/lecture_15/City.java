package lecture_15;

public class City {
    private static int count = 10;
    private static void staticMethod(){

    }
    private int nonStaticCount = 5;

    static class Park
    {
        int nonStaticVar = 3;
        static int staticVar = 3;

        static void walk(){
            System.out.println(count);
            staticMethod();
            //System.out.println(nonStaticCount);
        }
    }

    static void cityMethod(){
        Park park = new Park();
        System.out.println(park.nonStaticVar);
        System.out.println(Park.staticVar);
    }
}
