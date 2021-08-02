package org.fail.learnjavafromsimpletodifficult.lessons.lesson18getandset;

public class Main {
    public static void main(String[] args) {
        Dog lab = new Dog(4, 1, "Charley", "Labrador");

        Dog shepard = new Dog(4, 1, "Mike", "Shepard");


        System.out.println("Lab's name is " + lab.getName());
        System.out.println("Shepard's name is " + shepard.getName());
    }
}