package org.fail.learnjavafromsimpletodifficult.lessons.themes17_Inheritance.lesson25;

public class Auto {
    protected String manufacturer;
    protected String model;
    protected EngineType engineType;
    protected int currentSpeed;
    protected boolean isRunning;

    public Auto(String manufacturer, String model, EngineType engineType) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.engineType = engineType;

        System.out.println("Auto was initialized");
    }


    public void start() {

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

    public EngineType getEngineType() {
        return engineType;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public boolean isRunning() {
        return isRunning;
    }

    @Override
    public String toString() {
        return "Auto{" + "manufacturer='" + manufacturer + '\'' + ", model='" + model + '\'' + ", engineType=" + engineType + ", currentSpeed=" + currentSpeed + ", isRunning=" + isRunning + '}';
    }
}