package ru.job4j.tracker.tracker;

import ru.job4j.tracker.tracker.Input;
import ru.job4j.tracker.tracker.Tracker;
import ru.job4j.tracker.tracker.UserAction;

public class StubAction implements UserAction {
    private boolean call = false;

    @Override
    public String name() {
        return "Stub action";
    }

    @Override
    public int key() {
        return 0;
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        call = true;
        return false;
    }

    public boolean isCall() {
        return call;
    }
}