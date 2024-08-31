package ua.lesson4.car.electricCar;

import ua.lesson4.car.Car;

public class ElectricCar extends Car {

    public ElectricCar(String modelName, int year, String carCode) {
        super(modelName, year, carCode);
    }

    public void engineStatus(){
        if (engineStarted){
            System.out.println("Engine is started");
        } else{
            System.out.println("Engine is not started");
        }
    }
}
