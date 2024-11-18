package ua.lesson13._01;

public class Main {

    public static void main(String[] args) {

        DataHandler dataHandler= new DataHandler();
        Thread1 thread1 = new Thread1(dataHandler);
        Thread2 thread2 = new Thread2(dataHandler);

        thread1.start();
        thread2.start();
    }
}
