package org.fail.learnjavafromsimpletodifficult.lessons.themes17_Inheritance.lesson25;

public class InheritanceMain {
    public static void main(String[] args) {
        Bus bus = new Bus("Mercedes", "Sprinter", EngineType.DIESEL);


        System.out.println(bus.getManufacturer());
        System.out.println(bus.getModel());
    }
}
