package lecture_15;

public class Zoo {

    class Animal{
        static int staticVar = 10;

        static void eat(){

        }

        void sleep(){
            this.sleep();
            Zoo.this.nonStaticMethod();
        }

    }
    static void staticMethod(){
        //Animal animal = new Animal();
        Animal.eat();
        int staticVar = Animal.staticVar;
    }

    void nonStaticMethod(){

    }

}
