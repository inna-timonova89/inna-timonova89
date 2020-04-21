package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompareByAscName() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("X task", 4),
                new Job("Impl task", 2),
                new Job("Fix task", 0)
        );
        Collections.sort(jobs, new JobAscByName());
        List<Job> result = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix task", 0),
                new Job("Impl task", 2),
                new Job("X task", 4)
        );
        assertThat(jobs, is(result));
    }

    @Test
    public void whenCompareByAscPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 3),
                new Job("X task", 7),
                new Job("Impl task", 2),
                new Job("Fix task", 0)
        );
        Collections.sort(jobs, new JobAscByPriority());
        List<Job> result = Arrays.asList(
                new Job("Fix task", 0),
                new Job("Impl task", 2),
                new Job("Fix bug", 3),
                new Job("X task", 7)
        );
        assertThat(jobs, is(result));
    }

    @Test
    public void whenCompareByDescName() {
        List<Job> jobs = Arrays.asList(
                new Job("A bug", 1),
                new Job("X task", 4),
                new Job("Impl task", 2),
                new Job("Y task", 0)
        );
        Collections.sort(jobs, new JobDescByName());
        List<Job> result = Arrays.asList(
                new Job("Y task", 0),
                new Job("X task", 4),
                new Job("Impl task", 2),
                new Job("A bug", 1)
        );
        assertThat(jobs, is(result));
    }

    @Test
    public void whenCompareByDescPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Big bug", 2),
                new Job("X task", 5),
                new Job("Impl task", 3),
                new Job("Fix bug", 10)
        );
        Collections.sort(jobs, new JobDescByPriority());
        List<Job> result = Arrays.asList(
                new Job("Fix bug", 10),
                new Job("X task", 5),
                new Job("Impl task", 3),
                new Job("Big bug", 2)
        );
        assertThat(jobs, is(result));
    }

    @Test
    public void whenComparatorByDescNameAndDescPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByDescNameAndAscByPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 1),
                new Job("Impl task", 0)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByAscNameAndAscByPriority() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByAscNameAndDescByPriority() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 1),
                new Job("Impl task", 0)
        );
        assertThat(rsl, lessThan(0));
    }
}
