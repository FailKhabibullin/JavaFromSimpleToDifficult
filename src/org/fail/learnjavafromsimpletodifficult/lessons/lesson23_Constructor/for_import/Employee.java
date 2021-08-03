package org.fail.learnjavafromsimpletodifficult.lessons.lesson23_Constructor.for_import;

public class Employee {
    private static int id;
    private String name;
    private String position;
    private int salary;


    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;

        ++id;
    }

}