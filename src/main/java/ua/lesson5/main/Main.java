package ua.lesson5.main;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat("White");
        cat.name = "Kisuk";
        Animal dog = new Dog();
        dog.name = "Barsik";

        printAnimalName(cat);
        printAnimalName(dog);

    }
    private static void printAnimalName(Animal animal){
        System.out.println(animal.name);

        if (animal instanceof Cat){
            ((Cat) animal).meow();
        }
    }
}
