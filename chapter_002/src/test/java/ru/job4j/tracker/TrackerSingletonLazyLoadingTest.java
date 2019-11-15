package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.tracker.TrackerSingletonLazyLoading;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerSingletonLazyLoadingTest {
    @Test
    public void whenTrackerByLazyLoading() {
        TrackerSingletonLazyLoading tr1 = TrackerSingletonLazyLoading.getInstance();
        TrackerSingletonLazyLoading tr2 = TrackerSingletonLazyLoading.getInstance();
        assertThat(tr1.equals(tr2), is(true));
    }
}
