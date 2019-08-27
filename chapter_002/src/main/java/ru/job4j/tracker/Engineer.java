package ru.job4j.tracker;

public class Engineer extends Profession {
    private double grade;

    public Engineer(String fullName, long birthday, String specialization, double salary, double grade) {
        super(fullName, birthday, specialization, salary);
        this.grade = grade;
    }

    @Override
    public double getSalary() {
        return super.getSalary() * this.grade;
    }
}

class Programmer extends Engineer {
    private String programmingLanguage;

    public Programmer(String fullName, long birthday, String specialization, double salary, double grade, String programmingLanguage) {
        super(fullName, birthday, specialization, salary, grade);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String getSpecialization() {
        return super.getSpecialization() + this.programmingLanguage;
    }
}

class Builder extends Engineer {
    private String project;

    public Builder(String fullName, long birthday, String specialization, double salary, double grade, String project) {
        super(fullName, birthday, specialization, salary, grade);
        this.project = project;
    }

    public String getProject() {
        return this.project;
    }
}
