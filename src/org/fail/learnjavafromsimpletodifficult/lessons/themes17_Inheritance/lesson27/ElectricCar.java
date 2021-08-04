package org.fail.learnjavafromsimpletodifficult.lessons.themes17_Inheritance.lesson27;

public class ElectricCar extends Auto {
    private int batteryCapacity;
    private int passengerNumber;

    public ElectricCar(
            String manufacturer,
            String model,
            int batteryCapacity,
            int passengerNumber
    ) {
        super(manufacturer, model, EngineType.ELECTRIC);

        this.batteryCapacity = batteryCapacity;
        this.passengerNumber = passengerNumber;
        System.out.println("Constructing electric car");
    }

    public void charge() {
        System.out.println("Battery is charging");
    }

}