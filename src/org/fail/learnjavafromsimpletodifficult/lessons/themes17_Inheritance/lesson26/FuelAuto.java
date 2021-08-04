package org.fail.learnjavafromsimpletodifficult.lessons.themes17_Inheritance.lesson26;

import java.io.IOException;

public class FuelAuto extends Auto {
    private int availablePetrol;
    private final int tankVolume;

    public FuelAuto(String manufacturer, String model, EngineType engineType, int availablePetrol, int tankVolume) {
        super(manufacturer, model, engineType);
        this.availablePetrol = availablePetrol;
        this.tankVolume = tankVolume;
    }

    public void fuelUp(int fuelVolume) throws IOException {
        int estimatedFillingVolume = (availablePetrol + fuelVolume);

        if (estimatedFillingVolume <= tankVolume) {
            availablePetrol += fuelVolume;
        } else {
            System.out.println("Fuel full tank");
        }

        System.out.println("Adding fuel");
    }

    public int getAvailablePetrol() {
        return availablePetrol;
    }

    public int getTankVolume() {
        return tankVolume;
    }
}
