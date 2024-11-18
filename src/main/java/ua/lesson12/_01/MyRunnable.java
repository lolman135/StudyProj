package ua.lesson12._01;

import java.util.TreeMap;

public class MyRunnable extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            if (Thread.currentThread().isInterrupted()){
                System.out.println("Thread is interrupted");
                break;
            } else {
                System.out.println("Thread is running....");
            }
        }

    }
}
