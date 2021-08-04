package org.fail.learnjavafromsimpletodifficult.lessons.themes17_Inheritance.lesson26;

public class Truck extends FuelAuto {
    private int cargoWeight;
    private int cargoMaxWeight;

    public Truck(
            String manufacturer,
            String model,
            EngineType engineType,
            int availablePetrol,
            int tankVolume
    ) {
        super(manufacturer, model, engineType, availablePetrol, tankVolume);
        System.out.println("Constructing truck");
    }


    public void load(int loadWeight) {
        if ((loadWeight + cargoWeight) <= cargoMaxWeight) {
            cargoWeight += loadWeight;
        }
        System.out.println("Cargo load");
    }

    public void unLoad(int unLoadWeight) {
        if (unLoadWeight >= 0) {

            if ((cargoWeight - unLoadWeight) <= 0) {
                cargoWeight -= cargoWeight;
                return;
            }

            cargoWeight -= unLoadWeight;
        }
        System.out.println("Cargo Unload");
    }


    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }
}
