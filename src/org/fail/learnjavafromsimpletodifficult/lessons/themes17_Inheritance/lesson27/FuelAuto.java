package org.fail.learnjavafromsimpletodifficult.lessons.themes17_Inheritance.lesson27;

public class FuelAuto extends Auto {
    private int availablePetrol;
    private final int tankVolume;

    public FuelAuto(String manufacturer, String model, EngineType engineType, int availablePetrol, int tankVolume) {
        super(manufacturer, model, engineType);
        this.availablePetrol = availablePetrol;
        this.tankVolume = tankVolume;
    }

    public void fuelUp(int fuelVolume) {
        int estimatedFillingVolume = (availablePetrol + fuelVolume);

        if (estimatedFillingVolume <= tankVolume) {
            availablePetrol += fuelVolume;
        } else {
            System.out.println("The tank is already full");
        }

        System.out.println("Adding fuel: " + fuelVolume + ", current fuel: " + availablePetrol);
    }

    public int getAvailablePetrol() {
        return availablePetrol;
    }

    public int getTankVolume() {
        return tankVolume;
    }
}
