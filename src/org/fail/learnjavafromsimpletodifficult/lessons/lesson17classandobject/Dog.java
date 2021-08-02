package org.fail.learnjavafromsimpletodifficult.lessons.lesson17classandobject;

public class Dog {
    private int pow;
    private int tail;
    private String name;
    private String breed;

    public Dog(int pow, int tail, String name, String breed) {
        this.pow = pow;
        this.tail = tail;
        this.name = name;
        this.breed = breed;
    }

    public void setPow(int pow) {
        this.pow = pow;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
