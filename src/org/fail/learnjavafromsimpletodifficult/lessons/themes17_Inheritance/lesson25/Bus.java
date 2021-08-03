package org.fail.learnjavafromsimpletodifficult.lessons.themes17_Inheritance.lesson25;

public class Bus extends Auto {



    public Bus(String manufacturer, String model, EngineType engineType) {
        super(manufacturer, model, engineType);
        System.out.println("Bus was initialized");
    }
    static {
        System.out.println("Bus Static block 1");
    }
    {
        System.out.println("Bus Non-Static block 1");
    }
}