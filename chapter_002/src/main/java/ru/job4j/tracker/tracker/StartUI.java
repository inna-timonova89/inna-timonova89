package ru.job4j.tracker.tracker;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @version $Id$
 * @since 0.1
 */
public class StartUI {
    /**
     * Константа меню для добавления новой заявки.
     */
    private static final String ADD = "0";

    /**
     * Константа для вывода всех заявок.
     */
    private static final String SHOW = "1";

    /**
     * Константа для редактирования заявки.
     */
    private static final String EDIT = "2";

    /**
     * Константа для удаления заявки.
     */
    private static final String DELETE = "3";

    /**
     * Константа для поиска заявки по уникальному идентификатору.
     */
    private static final String FINDBYID = "4";

    /**
     * Константа для поиска заявки по названию.
     */
    private static final String FINDBYNAME = "5";

    /**
     * Константа для выхода из цикла.
     */
    private static final String EXIT = "6";

    /**
     * Получение данных от пользователя.
     */
    private Input input;

    /**
     * Хранилище заявок.
     */
    private Tracker tracker;

    /**
     * Конструтор инициализирующий поля.
     *
     * @param input   ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public StartUI() {
    }

    /**
     * Основной цикл программы.
     */
    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        List<Integer> range = new ArrayList<>();
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.indexOf(range));
            UserAction action = actions.get(select);
            action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        System.out.println("Menu.");
        int index = 0;
        for (UserAction action : actions) {
            System.out.println(action + "." + actions.get(index));
        }
    }

    /**
     * Метод реализует добавленяи новой заявки в хранилище.
     */
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("----- Create a new Item -----");
        System.out.println("Enter the name of the Item :");
        String name = input.askStr("");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("----- A new Item with Id : " + item.getId() + " is successfully created -----");
    }

    /**
     * Метод реализует вывод всех заявок в хранилище.
     */
    public static void showAllItems(Input input, Tracker tracker) {
        System.out.println("The list of all Items: ");
        List<Item> items = new ArrayList<>();
        for (Item item : items) {
            System.out.println(item.getName() + " " + item.getId());
            if (items == null) {
                System.out.println("There are no Items yet. You can create and add an Item. To do this enter 0 in the menu");
            }
        }
    }

    /**
     * Метод реализует изменение заявки в хранилище.
     */
    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("----- Update Item -----");
        List<Item> items = tracker.findAll();
            String id = input.askStr("Enter the Item's Id");
            String name = input.askStr("Enter a new name of the Item");
            Item item = new Item(name);
            item.setId(id);
            if (tracker.replace(id, item)) {
                System.out.println("Item " + id + " is ready for update");
                System.out.println("The Item " + item.getName() + " " + item.getId() + " is successfully updated");
            } else {
                System.out.println("The Item is not found");
            }
        }

    /**
     * Метод реализует удаление заявки из хранилища.
     */
    public static void deleteItem(Input input, Tracker tracker) {
        List<Item> items = tracker.findAll();
            System.out.println("Delete the Item");
            String id = input.askStr("Enter the Item's Id: ");
            Item item = new Item(id);
            if (tracker.delete(id)) {
                System.out.println("The Item " + id + " is ready for deletion");
                System.out.println("Your item " + id + " is successfully deleted");
            } else {
                System.out.println("The Item is not found");
            }
        }


    /**
     * Метод реализует поиск заявки в хранилище по уникальному идентификатору.
     */
    public static void findItemById(Input input, Tracker tracker) {
        List<Item> items = tracker.findAll();
            System.out.println("Find the Item by Id");
            boolean found = false;
            while (!found) {
                String id = input.askStr("Enter the Item's Id");
                Item item = tracker.findById(id);
                if (items != null && id.equals(item.getId())) {
                    System.out.println("The Item  " + item.getId() + " is successfully found");
                    found = true;
                } else {
                    System.out.println("The Item " + id + " is not found. Enter the Item's Id again: ");
                }
            }
        }

    /**
     * Метод реализует поиск заявки в хранилище по имени заявки.
     */
    public static void findItemByName(Input input, Tracker tracker) {
        List<Item> items = tracker.findAll();
            System.out.println("Find the Item by name");
            boolean found = false;
            while (!found) {
                String name = input.askStr("Enter the Item's name: ");
                List<Item> item = tracker.findByName(name);
                if (item == null) {
                    System.out.println("The Item " + name + " is not found. Enter the Item's name again: ");
                } else {
                    for (Item it : item) {
                        System.out.println("The Item " + it.getName() + " is successfully found");
                    }
                    found = true;
                }
            }
        }

    /**
     * Запускт программы.
     *
     * @param args
     */
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new UserAction() {
                    public String info() {
                        return "Info";
                    }

                    public int key() {
                        return 6;
                    }

                    public void execute(Input input, Tracker tracker) {
                    }
                }
        };
        new StartUI().init(validate, tracker, Arrays.asList(actions));
    }
}
