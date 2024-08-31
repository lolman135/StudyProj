package ua.lesson5.main;

public abstract class Animal {

    String name;

    public void eat(){
        System.out.println(name + " eat");
    }

    public abstract void run();
}
