package ru.job4j.tracker;

import ru.job4j.tracker.Profession;

public class Doctor extends Profession {
    private String diagnose;

    public Doctor(String fullName, long birthday, String specialization, double salary, String diagnose) {
        super(fullName, birthday, specialization, salary);
        this.diagnose = diagnose;
    }

    public Doctor() {
    }

    @Override
    public String getFullName() {
        return "Dr." + super.getFullName();
    }

    public String diagnoseHeal(Patient patient) {
        return this.diagnose;
    }
}
class Surgeon extends Doctor {
    private String bodyPart;
    public Surgeon(String fullName, long birthday, String specialization, double salary, String diagnose, String bodyPart) {
        super(fullName, birthday, specialization, salary, diagnose);
        this.bodyPart = bodyPart;
    }

    public Surgeon() {
}
    public String getBodyPart() {
        return this.bodyPart;
    }

    @Override
    public String getSpecialization() {
        return this.bodyPart + this.specialization;
    }
}

class Dentist extends Doctor {
    private double bonus;

    public Dentist() {
    }

    public Dentist(String fullName, long birthday, String specialization, double salary, String diagnose, double bonus) {
        super(fullName, birthday, specialization, salary, diagnose);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + this.bonus;
    }

    public double getBonus() {
        return super.getSalary() * 80;
    }
}