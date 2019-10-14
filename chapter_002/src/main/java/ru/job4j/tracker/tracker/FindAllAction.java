package ru.job4j.tracker.tracker;

public class FindAllAction implements UserAction {
    @Override
    public String name() {
        return "Find all.";
    }

    @Override
    public int key() {
        return 0;
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        for (Item item : tracker.findAll()) {
            System.out.println(String.format("%s %s", item.getId(), item.getName()));
        }
        return true;
    }
}
