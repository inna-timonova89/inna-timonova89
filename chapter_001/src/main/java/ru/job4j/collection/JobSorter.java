package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        Collections.sort(jobs, new JobDescByName().thenComparing(new JobDescByPriority()));
        Collections.sort(jobs, new JobDescByName().thenComparing(new JobAscByPriority()));
        Collections.sort(jobs, new JobAscByName().thenComparing(new JobAscByPriority()));
        Collections.sort(jobs, new JobAscByName().thenComparing(new JobDescByPriority()));
        System.out.println(jobs);

        List<Job> jobs1 = Arrays.asList(
                new Job("Big bug", 2),
                new Job("X task", 5),
                new Job("Impl task", 3),
                new Job("Fix bug", 10)
        );
        Collections.sort(jobs1, new JobAscByName());
        Collections.sort(jobs1, new JobAscByPriority());
        Collections.sort(jobs1, new JobDescByName());
        Collections.sort(jobs1, new JobDescByPriority());
        System.out.println(jobs1);

        List<Job> jobs = Arrays.asList(
                new Job("fix bugs", 4),
                new Job("Impl task", 2),
                new Job("Reboot server", 1)
        );
        System.out.println(jobs);
        Collections.sort(jobs);
        System.out.println(jobs);
        Collections.sort(jobs, new SortByNameJob());
        System.out.println(jobs);
    }
}
