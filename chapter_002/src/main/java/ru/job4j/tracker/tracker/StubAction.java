package ru.job4j.tracker.tracker;

import ru.job4j.tracker.tracker.Input;
import ru.job4j.tracker.tracker.Tracker;
import ru.job4j.tracker.tracker.UserAction;

public class StubAction implements UserAction {
    private boolean call = false;

    public String name() {
        return "Stub action";
    }

    @Override
    public String info() {
        return null;
    }

    @Override
    public int key() {
        return 0;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        call = true;
    }

    public boolean isCall() {
        return call;
    }
}
