package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.tracker.TrackerSingletonEagerLoading;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerSingletonEagerLoadingTest {

    @Test
    public void whenTrackerByEagerLoading() {
        TrackerSingletonEagerLoading tr1 = TrackerSingletonEagerLoading.getInstance();
        TrackerSingletonEagerLoading tr2 = TrackerSingletonEagerLoading.getInstance();
        assertThat(tr1.equals(tr2), is(true));
    }
}
