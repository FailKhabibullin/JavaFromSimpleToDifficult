package org.fail.learnjavafromsimpletodifficult.lessons.themes17_Inheritance.lesson27;

public class InheritanceMain {
    public static void main(String[] args) {
        Truck truck = new Truck(
                "Volvo",
                "VNL 300",
                EngineType.DIESEL,
                300,
                500
        );

        truck.start();
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

        System.out.println();

        Bus bus = new Bus("Mercedes", "Sprinter", EngineType.DIESEL, 30, 75, 12);
        bus.fuelUp(25);
        bus.pickUpPassenger(5);
        bus.start();
        bus.pickUpPassenger(5);
    }
}
