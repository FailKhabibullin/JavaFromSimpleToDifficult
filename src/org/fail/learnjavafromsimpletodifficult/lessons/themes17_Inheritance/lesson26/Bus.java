package org.fail.learnjavafromsimpletodifficult.lessons.themes17_Inheritance.lesson26;

import java.io.IOException;

public class Bus extends FuelAuto {
    private int passengerNumber;

    public Bus(
            String manufacturer, String model, EngineType engineType, int availablePetrol, int tankVolume
    ) {
        super(manufacturer, model, engineType, availablePetrol, tankVolume);
        System.out.println("Bus was initialized");
    }

    @Override
    public void fuelUp(int fuelVolume) throws IOException {
        super.fuelUp(fuelVolume);
    }

    public void pickUpPassenger(int passengerNumber) {
        if (!isRunning) {
            System.out.println("Bus is going!");
        } else {
            this.passengerNumber = passengerNumber;
            System.out.println("Passenger released");
        }
    }


    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }
}