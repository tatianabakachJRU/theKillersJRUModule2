package lecture_18.annotations_3;

public class MyCustomMain {
    public static void main(String[] args) {
        Class<MyCustomClass> myCustomClassClass = MyCustomClass.class;
        if(myCustomClassClass.isAnnotationPresent(MyCustomAnnotation.class)){
            MyCustomAnnotation annotation
                    = myCustomClassClass.getAnnotation(MyCustomAnnotation.class);
            String author = annotation.author();
            String date = annotation.date();
        }
        MyCustomClass myCustomClass = new MyCustomClass();
        myCustomClass.display();
    }
}
