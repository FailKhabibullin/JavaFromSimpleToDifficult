package org.fail.learnjavafromsimpletodifficult.lessons.themes17_Inheritance.lesson27;

public class Bus extends FuelAuto {
    private int passengerNumber;

    public Bus(
            String manufacturer,
            String model,
            EngineType engineType,
            int availablePetrol,
            int tankVolume,
            int passengerNumber
    ) {
        super(manufacturer, model, engineType, availablePetrol, tankVolume);
        this.passengerNumber = passengerNumber;
        System.out.println("Bus was initialized");
    }

    @Override
    public void fuelUp(int fuelVolume) {
        super.fuelUp(fuelVolume);
    }

    public void pickUpPassenger(int passengerNumber) {
        if (isRunning) {
            System.out.println("Bus is going!");
        } else {
            this.passengerNumber = passengerNumber;
            System.out.println("Passenger pickup");
        }
    }


    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }
}