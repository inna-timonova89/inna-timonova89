package ru.job4j.tracker.tracker;

import java.util.Objects;

/**
 * Класс Item
 * TASK:
 * 1. Создайте для модели данных tracker.Item компаратор, который сортирует данные по возрастанию.
 * 2. Создайте для модели данных tracker.Item компаратор, который сортирует данные по убыванию.
 * 3. Напишите тесты с демонстрацией сортировки по возрастанию и убыванию.
 */

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