package org.fail.learnjavafromsimpletodifficult.lessons.themes20_Polymorphism.lesson_29;

import org.jetbrains.annotations.NotNull;

public class InheritanceMain {
    public static void main(String[] args) {
        Engine truckEngine = new Engine(6.0, EngineType.DIESEL, 900);
        Truck truck = new Truck(
                "Volvo",
                "VNL 300",
                truckEngine,
                30,
                75,
                121
        );


        Engine busEngine = new Engine(3.5, EngineType.DIESEL, 150);
        Auto bus = new Bus(
                "Mercedes",
                "Sprinter",
                busEngine,
                30,
                75,
                12
        );

        ElectricCar electricCar = new ElectricCar(
                "Tesla",
                "Model S",
                4,
                10050
        );


        runAuto(truck);

        System.out.println();

        runAuto(bus);
    }

    public static void runAuto(@NotNull Auto auto) {
        auto.start();
        auto.stop();

        if (auto instanceof FuelAuto fuelAuto) {
            fuelAuto.fuelUp(10);
        }
    }

}
