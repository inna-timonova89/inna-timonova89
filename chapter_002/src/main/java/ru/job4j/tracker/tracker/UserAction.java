package ru.job4j.tracker.tracker;

import ru.job4j.tracker.tracker.Input;
import ru.job4j.tracker.tracker.Tracker;

public interface UserAction {
    String info();
    int key();
    void execute(Input input, Tracker tracker);
}
