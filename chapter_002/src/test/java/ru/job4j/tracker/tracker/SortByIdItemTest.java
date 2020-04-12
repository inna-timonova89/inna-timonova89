package ru.job4j.tracker.tracker;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.tracker.tracker.Item;
import ru.job4j.tracker.tracker.SortByIdItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.list;
import static java.util.Collections.sort;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortByIdItemTest {

    @Test
    public void whenByOrderSort() {
        List<Item> items = Arrays.asList(
                new Item("five", "5"),
                new Item("one", "1"),
                new Item("nine", "9")
        );
        Collections.sort(items, new SortByIdItem());
        List<Item> expected = Arrays.asList(
                new Item("one", "1"),
                new Item("five", "5"),
                new Item("nine", "9")
        );
        assertThat(items, is(expected));
    }

    @Test
    public void whenByReverseOrderSort() {
        List<Item> list = Arrays.asList(
                new Item("five", "5"),
                new Item("one", "1"),
                new Item("nine", "9")
        );
        Collections.sort(list, Collections.reverseOrder());
        List<Item> expected = Arrays.asList(
                new Item("nine", "9"),
                new Item("five", "5"),
                new Item("one", "1")
        );
        assertThat(expected, is(list));
    }
}
