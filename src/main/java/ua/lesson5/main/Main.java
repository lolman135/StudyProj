package ua.lesson5.main;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Musik";
        cat.color = "Black";
        cat.eat();
        cat.meow();

        Animal animal = new Animal();
        animal.name = "Furson";
        animal.eat();
    }
}
