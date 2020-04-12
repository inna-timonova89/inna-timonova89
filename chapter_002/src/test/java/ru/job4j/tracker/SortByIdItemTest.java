package ru.job4j.tracker;

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

/**
 * Я не могу понять, почему не работает тест))
 */

public class SortByIdItemTest {

    @Test
    public void whenByOrderSort() {
        List<Item> items = Arrays.asList(
                new Item("ten", "10"),
                new Item("three", "3"),
                new Item("seven", "7")
        );
        Collections.sort(items, new SortByIdItem());
        List<Item> expected = Arrays.asList(
                new Item("three", "3"),
                new Item("seven", "7"),
                new Item("ten", "10")
        );
        assertThat(items, is(expected));
    }

    @Test
    public void whenByReverseOrderSort() {
        List<Item> list = Arrays.asList(
                new Item("two", "2"),
                new Item("six", "6"),
                new Item("nine", "9")
        );
        Collections.sort(list, Collections.reverseOrder());
        List<Item> expected = Arrays.asList(
                new Item("nine", "9"),
                new Item("six", "6"),
                new Item("two", "2")
        );
        assertThat(expected, is(list));
    }
}
