package org.fail.learnjavafromsimpletodifficult.lessons.lesson4;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("HW!");

        byte b = 10; // -128, 127
        short s = 200; //
        int i = b + 23;
        long myLongValue = 123_456;

        float myFloatValue = 23.56F;
        double myDoubleValue = 56.43;

        var sum = b + s + i + myLongValue + myFloatValue + myDoubleValue;
        System.out.println("b + s + i + myLongValue + myFloatValue + myDoubleValue = " + sum);

        float floatValue = myFloatValue / 3;

        System.out.println("float Result " + floatValue);

        /*System.out.println("byte b = " + b);
        System.out.println("short s = " + s);
        System.out.println("int i = " + i);*/
    }
}