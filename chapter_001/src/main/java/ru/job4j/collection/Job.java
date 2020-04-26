package ru.job4j.collection;

import java.util.Objects;

public class Job implements Comparable<Job> {
    private String name;

    private int priority;

    public Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Job{"
                +
                "name'"
                + name
                + '\''
                +
                ", priority="
                + priority
                +
                '}';
    }

    @Override
    public int compareTo(Job another) {
        return Integer.compare(priority, another.priority);
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = super.equals(obj);
        if (obj instanceof Job) {
            Job job = (Job) obj;
            if (this.name.equals(job.name) && Objects.equals(this.priority, job.priority)) {
                result = true;
            }
        }
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, priority);
    }
}
