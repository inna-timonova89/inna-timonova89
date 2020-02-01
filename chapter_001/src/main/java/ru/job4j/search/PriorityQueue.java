package ru.job4j.search;

import java.util.LinkedList;

import ru.job4j.search.Task;

public class PriorityQueue {

    private LinkedList<Task> tasks = new LinkedList<Task>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставки использовать add(int index, E value)
     *
     * @param task задача
     */

    public void put(Task task) {
        int index = 0;
        for (index = 0; index < this.tasks.size(); index++) {
            if (this.tasks.get(index).getPriority() > task.getPriority()) {
                break;
            }
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.remove(0);
    }
}
