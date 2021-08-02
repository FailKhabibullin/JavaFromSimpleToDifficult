package org.fail.learnjavafromsimpletodifficult.lessons.lesson20_access_modifier;

public class Main {
    public static void main(String[] args) {
        Dog lab = new Dog(4, 1, "Charley", "Labrador", DogSize.BIG);
        Dog shepard = new Dog(4, 1, "Mike", "Shepard", DogSize.AVERAGE);
        Dog doberman = new Dog(4, 1, "Jack", "Doberman", DogSize.SMALL);

        doberman.bite();

        System.out.println("Lab's name is : " + lab.getName());
        System.out.println("Shepard's name is : " + shepard.getName());

    }
}