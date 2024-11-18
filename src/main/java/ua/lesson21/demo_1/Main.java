package ua.lesson21.demo_1;

public class Main {

    public static void main(String[] args) {

        @MyAnnotation
        int age = 10;

        System.out.println(Person.class.getAnnotation(PersonAnnotation.class));
        System.out.println(PersonChild.class.getAnnotation(PersonAnnotation.class));
    }
}
