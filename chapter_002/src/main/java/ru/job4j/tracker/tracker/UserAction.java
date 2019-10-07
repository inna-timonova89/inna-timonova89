package ru.job4j.tracker.tracker;

import ru.job4j.tracker.tracker.Input;
import ru.job4j.tracker.tracker.Tracker;

public interface UserAction {
    String name();
    int key();
    boolean execute(Input input, Tracker tracker);
}
