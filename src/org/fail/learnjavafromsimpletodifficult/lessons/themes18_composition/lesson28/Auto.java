package org.fail.learnjavafromsimpletodifficult.lessons.themes18_composition.lesson28;

public class Auto {
    protected String manufacturer;
    protected String model;
    protected Engine engine;
    protected int currentSpeed;
    protected boolean isRunning;


    public Auto(String manufacturer, String model, Engine engine) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.engine = engine;

        System.out.println("Auto was initialized");
    }

    public void start(){

        if (isRunning) {
            System.out.println("Engine is already started!");
        } else {
            isRunning = true;
            System.out.println("Engine is started!");
        }
    }

    public void stop() {

        if (isRunning) {
            isRunning = false;
            System.out.println("Engine has stopped!");
        } else {
            System.out.println("Engine is already stopped!");
        }

    }

    public void accelerate(int accelerateValue) {
        if (accelerateValue >= 0) {
            currentSpeed += accelerateValue;
            System.out.println("Speed accelerating: " + accelerateValue + ", current speed: " + currentSpeed);
        } else {
            System.out.println("accelerateValue is negative, " + "current speed: " + currentSpeed);
        }
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public boolean isRunning() {
        return isRunning;
    }

    @Override
    public String toString() {
        return "Auto{" + "manufacturer='" + manufacturer + '\'' + ", model='" + model + '\'' + ", engineType=" + engine + ", currentSpeed=" + currentSpeed + ", isRunning=" + isRunning + '}';
    }
}