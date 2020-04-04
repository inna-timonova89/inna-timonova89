package ru.job4j.tracker.tracker;

import ru.job4j.tracker.tracker.Item;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Tracker {
    /**
     * Список для хранение заявок.
     */
    private final List<Item> items = new ArrayList<>(100);

    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items.add(item);
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Метод реализаущий замену заявки в хранилище по Id
     * @param item новая заявка, на которую будет меняться старая заявка
     * @param id уникальный идентфикатор заявки
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        int index = 0;
        for (Item item1 : items) {
            if (item1.getId().equals(id)) {
                items.set(index, item);
                item.setId(id);
                result = true;
                break;
            }
            index++;
        }
        return result;
    }
    /**
     * Метод реализаущий удаление заявки из хранилища по Id
     * @param id уникальный идентфикатор заявки
     */
    public boolean delete(String id) {
        boolean result = false;
        int index = 0;
        for (Item item : items) {
            if (item.getId().equals(id)) {
                items.remove(index);
                result = true;
                break;
            }
            index++;
        }
        return result;
    }
    /**
     * Метод находит все заявки в хранилище
     */
    public List<Item> findAll() {
        return this.items;
    }
    /**
     * Метод ищет заявку в хранилище по названию (имени) заявки
     * @param name имя заявки
     */
    public List<Item> findByName(String name) {
        List<Item> result = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(name)) {
                result.add(item);
            }
        }
        return result;
    }
    /**
     * Метод ищет заявку в хранилище по Id
     * @param id уникальный идентфикатор заявки
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
}
