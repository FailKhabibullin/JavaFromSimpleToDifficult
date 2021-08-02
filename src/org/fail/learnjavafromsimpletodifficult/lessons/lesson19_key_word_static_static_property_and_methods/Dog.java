package org.fail.learnjavafromsimpletodifficult.lessons.lesson19_key_word_static_static_property_and_methods;

public class Dog {
    private final int _pow;
    private final int _tail;
    private final String _name;
    private final String _breed;
    private final DogSize _size;

    private static int dogsCount;

    public Dog(int paws, int tail, String name, String breed, DogSize size) {
        ++dogsCount;
        this._pow = paws;
        this._tail = tail;
        this._name = name;
        this._breed = breed;
        this._size = size;

        System.out.println("Dog's count is: " + dogsCount);
    }

    public String bark() {
        return switch (_size) {
            case BIG -> ("Wof - Wof");
            case AVERAGE -> ("Raf - Raf");
            case SMALL -> ("Tiff - Tiff");
        };
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
