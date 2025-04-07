package lecture_18.annotations_2;

public class TestClass {
    @MyAnnotation(value = "Hello", number = 5)
    public void annotatedMethod(){
        System.out.println("Annotated Method");
    }
}
