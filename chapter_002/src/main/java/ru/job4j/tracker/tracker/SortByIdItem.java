package ru.job4j.tracker.tracker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortByIdItem implements Comparator<Item> {

    @Override
    public int compare(Item first, Item second) {
        return first.getId().compareTo(second.getId());
    }
}
