package ru.job4j.tracker.tracker;

import java.util.Objects;

public class Item implements Comparable<Item> {
    private String id;
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public Item(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id'" + id + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Item another) {
        return id.compareTo(another.getId());
    }
}