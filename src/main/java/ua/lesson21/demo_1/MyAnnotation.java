package ua.lesson21.demo_1;

import java.lang.annotation.*;

@Inherited
@Target(ElementType.LOCAL_VARIABLE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value() default "Inn";
}
