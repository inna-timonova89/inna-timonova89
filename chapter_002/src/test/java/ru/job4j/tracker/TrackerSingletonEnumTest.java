package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.tracker.Tracker;
import ru.job4j.tracker.tracker.TrackerSingletonEnum;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerSingletonEnumTest {

    @Test
    public void whenTrackerByEnum() {
        TrackerSingletonEnum tr1 = TrackerSingletonEnum.INSTANCE;
        TrackerSingletonEnum tr2 = TrackerSingletonEnum.INSTANCE;
        assertThat(tr1.equals(tr2), is(true));
    }
}
