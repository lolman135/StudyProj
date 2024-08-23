package ua.lesson4.car;

public class Car {
    private String modelName;
    int year;
    protected boolean engineStarted;
    public String carCode;
    private double fuelLevel;

    public Car(String modelName, int year, String carCode) {
        this.modelName = modelName;
        this.year = year;
        this.carCode = carCode;
        engineStarted = false;
        fuelLevel = 50.0;
    }
}
