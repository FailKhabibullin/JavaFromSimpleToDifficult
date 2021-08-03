package org.fail.learnjavafromsimpletodifficult.lessons.lesson24_Consructor_Objecct_Init;

public class Employee {
    private static int id;
    private String name;
    private String position;
    private int salary;
    private String department;

    static {
        id = 100;
        System.out.println("Static init block called!");
    }

    {
        department = "IT";
        System.out.println("Non-static init block called!");
    }

    private Employee(String name, String position, int salary, String department) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.department = department;

        System.out.println("Four param constructor");
    }

    public Employee(String name, String position, int salary) {
        this(name, position, salary, "IT");
        id++;

        System.out.println("Three param constructor");
    }

    public Employee() {
        this("A", "B", 1);
        System.out.println("Default constructor");
    }
}