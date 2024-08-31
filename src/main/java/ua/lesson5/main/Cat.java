package ua.lesson5.main;

public class Cat extends Animal{

    public final String color;

    public Cat(String color){
        this.color = color;
    }

    public void meow(){
         System.out.println(name + " doing MEOW!!!!!!");
    }

    @Override
    public final void eat() {
        System.out.println(color + " " + name + " eat");
    }

    @Override
    public void run() {
        System.out.println("Run slowest than dog");
    }



}
