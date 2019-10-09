package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student student = freshman;
        Object object = freshman;

        freshman.name();
        student.name();
        object.name();

        System.out.println(new Object());
        System.out.println(new Student());
        System.out.println(new Freshman());
    }
}
