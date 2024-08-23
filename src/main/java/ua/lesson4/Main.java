package ua.lesson4;

import ua.lesson4.car.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Zaporozhec", 1982, "AE 1023 XP");
        System.out.println(car.carCode);
    }
}
