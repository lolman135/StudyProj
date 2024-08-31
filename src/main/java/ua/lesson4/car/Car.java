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

    public Car(String modelName, int year, String carCode, double fuelLevel) {
        this.modelName = modelName;
        this.year = year;
        this.carCode = carCode;
        engineStarted = false;
        this.fuelLevel = fuelLevel;
    }

    public void startCar(){
        if (checkFuelLelev() && checkEngine()){
            startEngine();
            System.out.println("Car is started");
        } else{
            System.out.println("Cannot start engine");
        }
    }

    private boolean checkFuelLelev(){
        if (fuelLevel > 10.0){
            System.out.println("Enough fuel");
            return true;
        } else {
            System.out.println("Not enough fuel");
            return false;
        }
    }

    private boolean checkEngine(){
        System.out.println("Engine: " + (engineStarted ? "Alredy started" : "Ready to start"));
        return !engineStarted;
    }

    private void startEngine(){
        if (!engineStarted){
            engineStarted = true;
            System.out.println("Engine started");
        }
    }

    public String getModelName(){
        return modelName;
    }

    public boolean isEngineStarted() {
        return engineStarted;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        if (fuelLevel == 0){
            System.out.println("Cannot be as 0");
        } else {
            this.fuelLevel = fuelLevel;
        }
    }
}
