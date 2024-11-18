package ua.lesson12._01;

public class Main {

    public static void main(String[] args) {

        MyRunnable mr = new MyRunnable();
        mr.start();

        for (int i = 0; i < 30; i++) {
            System.out.println("Main thread is running....");
        }

        mr.interrupt();
    }
}
