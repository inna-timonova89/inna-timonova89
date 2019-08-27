package ru.job4j.tracker;

public class Engineer extends Profession {
    public String scienceField;
    public double grade;

    public Engineer(String name, String surname, String education, String specialization, long birthday, double salary, String scienceField, double grade) {
        super(name,  surname, education, birthday, specialization, salary);
        this.scienceField = scienceField;
        this.grade = grade;
    }

    public String getScienceField() {
        return scienceField;
    }

    @Override
    public double getSalary() {
        return super.getSalary() * this.grade;
    }
}

class Programmer extends Engineer {
    public String typeOfProduct;
    public String programmingLanguage;
    public boolean distanceWork;

    public Programmer(String name, String surname, String education, String specialization, long birthday, double salary, String scienceField, double grade, String typeOfProduct, String programmingLanguage, boolean distanceWork) {
        super(name, surname, education, specialization, birthday, salary, scienceField, grade);
        this.typeOfProduct = typeOfProduct;
        this.programmingLanguage = programmingLanguage;
        this.distanceWork = distanceWork;
    }

    public boolean isDistanceWork() {
        return false;
    }

    @Override
    public String getSpecialization() {
        return super.getSpecialization() + this.programmingLanguage;
    }
}

class Builder extends Engineer {
    public String project;
    public String architecture;

    public Builder(String name, String surname, String education, String specialization, long birthday, double salary, String scienceField, double grade, String project, String architecture) {
        super(name, surname, education, specialization, birthday, salary, scienceField, grade);
        this.project = project;
        this.architecture = architecture;
    }

    public String getArchitecture() {
        return this.architecture;
    }
}
