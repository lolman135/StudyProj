package ua.lesson5.main.interfaces;

public class Bird implements Flyible, Eattble{

    @Override
    public void fly() {
        System.out.println("Bird fly");
    }

    @Override
    public void eat() {
        System.out.println("Bird eat");
    }

    public void live(){
        fly();
        eat();
    }
}
