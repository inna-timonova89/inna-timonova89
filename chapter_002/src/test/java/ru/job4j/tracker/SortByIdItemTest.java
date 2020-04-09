package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.tracker.Item;
import ru.job4j.tracker.tracker.SortByIdItem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortByIdItemTest {

    @Test
    public void whenByOrderSort() {
        List<Item> list = Arrays.asList(
                new Item("one", "1"),
                new Item("four", "4"),
                new Item("ten", "10")
        );
        Collections.sort(list, new SortByIdItem());
        List<Item> expected = list;
        assertThat(expected, is(list));
    }

    @Test
    public void whenByReverseOrderSort() {
        List<Item> list = Arrays.asList(
                new Item("two", "2"),
                new Item("six", "6"),
                new Item("nine", "9")
        );
        Collections.sort(list, Collections.reverseOrder());
        List<Item> expected = list;
        assertThat(expected, is(list));
    }
}
