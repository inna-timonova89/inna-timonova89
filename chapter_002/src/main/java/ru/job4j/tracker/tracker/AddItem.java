package ru.job4j.tracker.tracker;

public class AddItem extends BaseAction {

    public AddItem(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name:");
        String desc = input.askStr("Enter description");
        tracker.add(new Item(name, desc));
    }
}

class ShowItem extends BaseAction {

    public ShowItem(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        for (Item item : tracker.findAll()) {
            System.out.println(String.format("Name: %s| Id: %s",
            item.getName(), item.getId()));
        }
    }
}
