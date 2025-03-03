package lecture_8.staticClasses;

public class Outer
{
    int number = 6;
    static int staticNumber = 6;

    protected static class Inner
    {
        void display(){
            int i = staticNumber + 7;
            //int i1 = number + 8;
            System.out.println("Static nested class");
        }

    }


}
