package org.fail.learnjavafromsimpletodifficult.lessons.lesson18getandset;

public class Dog {
    private int _pow;
    private int _tail;
    private String _name;
    private String _breed;

    public Dog(int pow, int tail, String name, String breed) {
        this._pow = pow;
        this._tail = tail;
        this._name = name;
        this._breed = breed;
    }

    public int getPow() {
        return _pow;
    }

    public void setPow(int pow) {
        if (_pow == 4) {
            throw new NumberFormatException("Mutant dog!");
        }
        _pow = pow;
    }

    public int getTail() {
        return _tail;
    }

    public void setTail(int tail) {
        _tail = tail;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getBreed() {
        return _breed;
    }

    public void setBreed(String breed) {
        _breed = breed;
    }
}
