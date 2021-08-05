package org.fail.learnjavafromsimpletodifficult.lessons.themes20_Polymorphism.lesson_29;

public class ElectricCar extends Auto {
    private int batteryCapacity;
    private int passengerNumber;

    public ElectricCar(
            String manufacturer,
            String model,
            int batteryCapacity,
            int passengerNumber
    ) {
        super(manufacturer, model, new Engine());

        this.batteryCapacity = batteryCapacity;
        this.passengerNumber = passengerNumber;
        System.out.println("Constructing electric car");
    }

    public void charge() {
        System.out.println("Battery is charging");
    }

}