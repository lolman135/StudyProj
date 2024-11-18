package ua.lesson16._01;

public class Main {

    static Calculator calculator;
    static double a;
    static double b;

    public static void main(String[] args) {

        Runnable myRunnable = () -> System.out.println("gagaga");

        a = 5;
        b = 4;

        calculator = Double::sum;
        System.out.println(calculator.addition(a, b));

        Demo1 demo1 = str -> System.out.println(str);

        demo1.print("dsdsds");

        myRunnable.run();
    }

}
