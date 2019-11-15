package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.tracker.TrackerSingletonClassLazyLoading;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerSingletonClassLazyLoadingTest {

    @Test
    public void whenTrackerByClassLazyLoading() {
        TrackerSingletonClassLazyLoading tr1 = TrackerSingletonClassLazyLoading.getInstance();
        TrackerSingletonClassLazyLoading tr2 = TrackerSingletonClassLazyLoading.getInstance();
        assertThat(tr1.equals(tr2), is(true));
    }
}
