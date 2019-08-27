package ru.job4j.tracker;

import ru.job4j.tracker.Profession;

public class Doctor extends Profession {
    public int patients;
    public String diagnose;

    public Doctor(String name, String surname, String education, long birthday, String specialization, double salary, int patients, String diagnose) {
        super(name,  surname, education, birthday, specialization, salary);
        this.patients = patients;
        this.diagnose = diagnose;
    }

    public Doctor() {
    }

    @Override
    public String getName() {
        return "Dr." + super.getName();
    }

    public String diagnoseHeal(Patient patient) {
        return this.diagnose;
    }

    public int getPatients() {
        return patients;
    }
}
class Surgeon extends Doctor {
    public int operations;
    public String bodyPart;
    public Surgeon(String name, String surname, String education, long birthday, String specialization, double salary, int patients, String diagnose, int operations, String bodyPart) {
        super(name, surname, education, birthday, specialization, salary, patients, diagnose);
        this.operations = operations;
        this.bodyPart = bodyPart;
    }

    public Surgeon() {
}
    public String getBodyPart() {
        return this.bodyPart;
    }

    public int getOperations() {
        return this.operations;
    }

    @Override
    public String getSpecialization() {
        return this.bodyPart + this.specialization;
    }
}

class Dentist extends Doctor {
    public String clinic;
    public double bonus;

    public Dentist() {
    }

    public Dentist(String name, String surname, String education, String specialization, int patients, int birthday, double salary, String diagnose, String clinic, double bonus) {
        super(name, surname, education, birthday, specialization, salary, patients, diagnose);
        this.clinic = clinic;
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + this.bonus;
    }

    public String getClinic() {
        return this.clinic;
    }

    public double getBonus() {
        return super.getSalary() * 80;
    }
}
