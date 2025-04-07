package lecture_18.annotations_2;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
@Documented

@interface MyAnnotation {
    String value();
    int number() default 10;
}
