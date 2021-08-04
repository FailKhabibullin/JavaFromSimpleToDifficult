package org.fail.learnjavafromsimpletodifficult.lessons.themes18_composition.lesson28;

public class Truck extends FuelAuto {
    private int cargoWeight;
    private int cargoMaxWeight;

    public Truck(
            String manufacturer,
            String model,
            Engine engine,
            int availablePetrol,
            int tankVolume
    ) {
        super(manufacturer, model, engine, availablePetrol, tankVolume);
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
