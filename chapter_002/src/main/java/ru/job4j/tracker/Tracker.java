package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
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
        for (int i = 0; i < position; i++) {
            if (items[i].getId().equals(id) && items[i] != null) {
                item.setId(id);
                items[i] = item;
                result = true;
            }
        }
        return result;
    }
    /**
     * Метод реализаущий удаление заявки из хранилища по Id
     * @param id уникальный идентфикатор заявки
     */
    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < position; i++) {
            if (items[i].getId().equals(id) && items[i] != null) {
                System.arraycopy(items, i + 1, items, i, items.length - 2);
                items[items.length - 1] = null;
                result = true;
                position--;
            }
        }
        return result;
    }
    /**
     * Метод находит все заявки в хранилище
     */
    public Item[] findAll() {
        Item[] result = new Item[this.position];
        return Arrays.copyOf(this.items, this.position);
    }
    /**
     * Метод ищет заявку в хранилище по названию (имени) заявки
     * @param key имя заявки
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[this.position];
        int count = 0;
        for (int i = 0; i < this.position; i++) {
            if (items[i].getName().equals(key) && items [i] != null) {
                result[count] = this.items[i];
                count++;
            }
        }
        return Arrays.copyOf(this.items, this.position);
    }
    /**
     * Метод ищет заявку в хранилище по Id
     * @param id уникальный идентфикатор заявки
     */
    public Item findById(String id) {
        Item result = null;
        for (int i = 0; i < this.position; i++) {
            if (items[i] != null && items[i].getId().equals(id)) {
                result = this.items[i];
                break;
            }
        }
        return result;
    }
}
