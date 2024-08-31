package ua.lesson4;

import ua.lesson4.car.Car;
import ua.lesson4.car.electricCar.ElectricCar;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Zaporozhec", 1982, "AE 1023 XP");
        car.startCar();

        System.out.println("\nfuel level: " + car.getFuelLevel());
        System.out.println("engine started: " + car.isEngineStarted());
        System.out.println("model name: " + car.getModelName());

        car.setFuelLevel(55.0);
        System.out.println("\nfuel level: " + car.getFuelLevel());

        ElectricCar secondCar = new ElectricCar("Tesla model X", 2020, "KA 1024 YI");
        secondCar.startCar();
        secondCar.engineStatus();
    }

}
