package ua.lesson21.demo_1;

import java.lang.annotation.*;

@Inherited
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface PersonAnnotation {
    String name() default "Kyrylo";
}
