package org.fail.learnjavafromsimpletodifficult.lessons.themes20_Polymorphism.lesson_29;

public class Bus extends FuelAuto {
    private int passengerNumber;

    public Bus(
            String manufacturer,
            String model,
            Engine engine,
            int availablePetrol,
            int tankVolume,
            int passengerNumber
    ) {
        super(manufacturer, model, engine, availablePetrol, tankVolume);
        this.passengerNumber = passengerNumber;
        System.out.println("Bus was initialized");
    }

    @Override
    public void start() {
        System.out.println("Bus is started");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("Bus has stopped");
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