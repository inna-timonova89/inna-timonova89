package ru.job4j.tracker;

public class Profession {
    private  String fullName;
    private long birthday;
    public String specialization;
    private double salary;

    public Profession(String fullName, long birthday, String specialization, double salary) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.specialization = specialization;
        this.salary = salary;
    }
    public Profession() {
    }

    public String getFullName() {
        return this.fullName;
    }

    public long getBirthday() {
        return this.birthday;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public double getSalary() {
        return this.salary;
    }
}
