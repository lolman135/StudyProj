package ua.lesson5.main;

public class Dog extends Animal {

    public void bark(){
        System.out.println(name + "doing BARK!!!");
    }

    @Override
    public void run() {
        System.out.println("Run fastest than cat");
    }
}
