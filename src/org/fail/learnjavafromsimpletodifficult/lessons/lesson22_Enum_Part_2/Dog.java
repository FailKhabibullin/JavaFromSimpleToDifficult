package org.fail.learnjavafromsimpletodifficult.lessons.lesson22_Enum_Part_2;

public class Dog {
    private final int _pow;
    private final int _tail;
    private final String _name;
    private final String _breed;
    private DogSize _size = DogSize.UNDEFINED;

    protected static int dogsCount;

    public Dog(int paws, int tail, String name, String breed, DogSize size) {
        ++dogsCount;
        this._pow = paws;
        this._tail = tail;
        this._name = name;
        this._breed = breed;
        this._size = size;

//        System.out.println("Dog's count is: " + dogsCount);
    }

    public void bark() {
        switch (_size) {
            case VERY_BIG:
            case BIG:
                System.out.println("Wof - Wof");
                break;
            case AVERAGE:
                System.out.println("Raf - Raf");
                break;
            case SMALL:
            case VERY_SMALL:
                System.out.println("Tiff - Tiff");
                break;
            default:
//                throw new IllegalStateException("Unexpected value: " + _size);
                System.out.println();
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
