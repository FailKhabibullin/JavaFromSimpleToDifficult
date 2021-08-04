package org.fail.learnjavafromsimpletodifficult.lessons.themes17_Inheritance.lesson26;

public class ElectricCar extends Auto {
    private int batteryCapacity;
    private int passengerNumber;

    public ElectricCar(
            String manufacturer,
            String model,
            EngineType engineType,
            int batteryCapacity,
            int passengerNumber
    ) {
        super(manufacturer, model, EngineType.ELECTRIC);

        this.batteryCapacity = batteryCapacity;
        this.passengerNumber = passengerNumber;
    }

    public void charge() {
        System.out.println("Battery is charging");
    }

}