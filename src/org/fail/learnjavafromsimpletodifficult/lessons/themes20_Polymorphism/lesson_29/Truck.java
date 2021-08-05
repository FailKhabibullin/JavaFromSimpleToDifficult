package org.fail.learnjavafromsimpletodifficult.lessons.themes20_Polymorphism.lesson_29;

public class Truck extends FuelAuto {
    private int cargoWeight;
    private int cargoMaxWeight;

    public Truck(
            String manufacturer,
            String model,
            Engine engine,
            int availablePetrol,
            int tankVolume,
            int cargoMaxWeight
    ) {
        super(manufacturer, model, engine, availablePetrol, tankVolume);
        this.cargoMaxWeight = cargoMaxWeight;
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

    @Override
    public void start() {
        super.start();
        System.out.println("Truck is started");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("Truck has stopped");
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }
}
