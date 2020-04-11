package ru.job4j.tracker.tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * сортировка по идентификатору через компаратор
 * Запускт программы: проверка, что сортировка работает корретно.
 * @param args
 */

public class ItemSorter {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("five", "5"),
                new Item("one", "1"),
                new Item("nine", "9")
        );
        System.out.println(items);
        Collections.sort(items, new SortByIdItem());
        System.out.println(items);
        Collections.sort(items, Collections.reverseOrder());
        System.out.println(items);
    }
}