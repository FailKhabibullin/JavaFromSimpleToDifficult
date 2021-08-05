package org.fail.learnjavafromsimpletodifficult.lessons.themes20_Polymorphism.lesson_29;

public class Piston {
    private double volume;
    private int pistonNumber;

    public Piston(double volume, int pistonNumber) {
        this.volume = volume;
        this.pistonNumber = pistonNumber;
    }

    public void movePiston() {
        System.out.println("Piston #" + pistonNumber + ", is moving");
    }

    @Override
    public String toString() {
        return "Piston{" + "volume=" + volume + ", pistonNumber=" + pistonNumber + '}';
    }
}
