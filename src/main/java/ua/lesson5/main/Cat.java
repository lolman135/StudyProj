package ua.lesson5.main;

public class Cat extends Animal{

    public String color;

    public void meow(){
         System.out.println(name + " doing MEOW!!!!!!");
    }

    @Override
    public void eat() {
        System.out.println(color + " " + name + " eat");
    }
}
