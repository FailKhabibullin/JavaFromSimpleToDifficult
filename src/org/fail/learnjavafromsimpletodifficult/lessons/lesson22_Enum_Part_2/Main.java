package org.fail.learnjavafromsimpletodifficult.lessons.lesson22_Enum_Part_2;

public class Main {
    public static void main(String[] args) {
        Dog lab = new Dog(4, 1, "Charley", "Labrador", DogSize.BIG);
        Dog shepard = new Dog(4, 1, "Mike", "Shepard", DogSize.AVERAGE);
        Dog doberman = new Dog(4, 1, "Jack", "Doberman", DogSize.SMALL);

//        doberman.bite();

//        System.out.println("Lab's name is : " + lab.getName());
//        System.out.println("Shepard's name is : " + shepard.getName());

        DogSize size = DogSize.SMALL;
//        System.out.println(size.getAbbreviation());
//        System.out.println(size);
        DogSize size1 = DogSize.valueOf("BIG");
//        System.out.println(size1);

        DogSize[] dogSizesValue = DogSize.values();
        for (DogSize dogSize : dogSizesValue) {
            System.out.println(dogSize);
        }

    }
}