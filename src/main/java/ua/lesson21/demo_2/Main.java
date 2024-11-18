package ua.lesson21.demo_2;

public class Main {

    public static void main(String[] args) {

        Car[] cars = new Car[]{
                new Audi(),
                new BMW(),
                new Nissan()
        };

        System.out.println("Cars can't ride on days:");

        for (Car car : cars) {
            Class<? extends Car> clazz = car.getClass();
            System.out.println("car: " + clazz.getSimpleName());

            CarBan annotation = clazz.getAnnotation(CarBan.class);
            for (CarDays day : annotation.days()) {
                System.out.println(day);
            }
            System.out.println();
        }
    }
}


