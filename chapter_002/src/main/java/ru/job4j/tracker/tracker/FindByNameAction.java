package ru.job4j.tracker.tracker;

import ru.job4j.tracker.tracker.Input;
import ru.job4j.tracker.tracker.Item;
import ru.job4j.tracker.tracker.Tracker;
import ru.job4j.tracker.tracker.UserAction;

public class FindByNameAction implements UserAction {

    public String name() {
        return "Find by name";
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
        for (Item item : tracker.findAll()) {
            System.out.println(item.getName());
        }
    }
}


//package ru.job4j.tracker.tracker;
//
//public class FindByNameAction extends BaseAction {
//
//    public FindByNameAction(int key, String name) {
//        super(key, name);
//    }
//
//    @Override
//    public void execute(Input input, Tracker tracker) {
//        for (Item item : tracker.findAll()) {
//            System.out.println(item.getName());
//        }
//    }
//}
