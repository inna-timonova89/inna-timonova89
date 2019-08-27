package ru.job4j.tracker;

public class Profession {
    public  String name;
    public String surname;
    public String education;
    public long birthday;
    public String specialization;
    public double salary;

    public Profession(String name, String surname, String education, long birthday, String specialization, double salary) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
        this.specialization = specialization;
        this.salary = salary;
    }
    public Profession() {
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getEducation() {
        return this.education;
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
