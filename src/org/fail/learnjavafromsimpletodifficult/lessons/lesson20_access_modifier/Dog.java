package org.fail.learnjavafromsimpletodifficult.lessons.lesson20_access_modifier;

public class Dog {
    private final int _pow;
    private final int _tail;
    private final String _name;
    private final String _breed;
    private final DogSize _size;

    protected static int dogsCount;

    public Dog(int paws, int tail, String name, String breed, DogSize size) {
        ++dogsCount;
        this._pow = paws;
        this._tail = tail;
        this._name = name;
        this._breed = breed;
        this._size = size;

        System.out.println("Dog's count is: " + dogsCount);
    }

    public void bark() {
        switch (_size) {
            case BIG:
                System.out.println("Wof - Wof");
                break;
            case AVERAGE:
                System.out.println("Raf - Raf");
                break;
            case VERY_BIG:
                System.out.println();
                break;
            case SMALL:
                System.out.println("Tiff - Tiff");
                break;
            case VERY_BIG_:
                System.out.println();
                break;
        }
        ;
    }

    public void bite() {
        if (dogsCount > 2) {
            System.out.println("Dog's are biting you");
        } else {
            bark();
        }

    }

    public int getPow() {
        return _pow;
    }

    public int getTail() {
        return _tail;
    }

    public String getName() {
        return _name;
    }

    public String getBreed() {
        return _breed;
    }

    public String getSize() {
        return _size.name();
    }

    public static int getDogsCount() {
        return dogsCount;
    }
}
