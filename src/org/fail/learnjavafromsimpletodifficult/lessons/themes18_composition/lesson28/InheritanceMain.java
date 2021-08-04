package org.fail.learnjavafromsimpletodifficult.lessons.themes18_composition.lesson28;

import java.util.List;

public class InheritanceMain {
    public static void main(String[] args) {

      /*  Engine truckEngine = new Engine(6.0, EngineType.DIESEL, 900);

        //noinspection DuplicatedCode
        Truck truck = new Truck(
                "Volvo",
                "VNL 300",
                truckEngine,
                300,
                500
        );*/

        //noinspection DuplicatedCode
      /*  truck.start();
        truck.accelerate(40);
        truck.stop();
        truck.fuelUp(50);
        truck.load(100);
        truck.unLoad(100);

        System.out.println();

        ElectricCar tesla = new ElectricCar("Tesla", "Model S", 4, 100500);
        tesla.start();
        tesla.stop();
        tesla.charge();

        System.out.println();*/

        Engine busEngine = new Engine(3.5, EngineType.DIESEL, 150);

        Bus bus = new Bus("Mercedes", "Sprinter", busEngine, 30, 75, 12);
        bus.fuelUp(25);
        bus.pickUpPassenger(5);
        bus.start();
        bus.pickUpPassenger(5);

        System.out.println();

        Engine engine = bus.getEngine();
        System.out.println(engine.getPower());
        List<Piston> pistons = engine.getPistons();
        System.out.println(pistons);

    }
}
