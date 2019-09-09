package ru.job4j.tracker;

import java.util.Scanner;

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
    private final Input input;

    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

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

    /**
     * Основной цикл программы.
     */
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            switch (answer) {
                case ADD:
                    this.createItem();
                    break;
                case SHOW:
                    this.showAllItems();
                    break;
                case EDIT:
                    this.editItem();
                    break;
                case DELETE:
                    this.deleteItem();
                    break;
                case FINDBYID:
                    this.findItemById();
                    break;
                case FINDBYNAME:
                    this.findItemByName();
                    break;
                case EXIT:
                    exit = true;
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * Метод реализует добавленяи новой заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите название заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }

    /**
     * Метод реализует вывод всех заявок в хранилище.
     */
    private void showAllItems() {
        System.out.println("Список всех заявок: ");
        Item[] items = tracker.findAll();
        if (items.length == 0) {
            System.out.println("Еще нет ни одной заявки. Вы можете добавить заявку. Для этого введитее пункт меню 0");
        } else {
            for (Item item : items) {
                System.out.println(item.getName() + " " + item.getId());
            }
        }
    }


    /**
     * Метод реализует изменение заявки в хранилище.
     */
    private void editItem() {
        System.out.println("Изменение заявки...");
        Item[] items = tracker.findAll();
        if (items.length == 0) {
            System.out.println("Еще нет ни одной заявки. Вы можете добавить заявку. Для этого введитее пункт меню 0");
        } else {
            String id = input.ask("Введите идентиикатор заявки");
            String name = input.ask("Введите название заявки");
            System.out.println("Заявка " + name + " готова к изменению...");
            Item item = new Item(name, id);
            String name2 = input.ask("Введите новое название заявки");
            Item item2 = new Item(name2, id);
            this.tracker.replace(id, item2);
            System.out.println("Ваша заявка " + item.getName() + " " + item.getId() + " успешно изменена на " + item2.getName() + " " + item2.getId());
        }
    }

    /**
     * Метод реализует удаление заявки из хранилища.
     */
    private void deleteItem() {
        Item[] items = tracker.findAll();
        if (items.length == 0) {
            System.out.println("Еще нет ни одной заявки. Вы можете добавить заявку. Для этого введитее пункт меню 0");
        } else {
            System.out.println("Удаление заявки...");
            String id = input.ask("Введите идентификатор заявки: ");
                System.out.println("Заявка " + id + " готова к удалению...");
                Item item = new Item(id);
                this.tracker.delete(id);
                System.out.println("Ваша заявка " + id + " успешно удалена");
        }
    }

    /**
     * Метод реализует поиск заявки в хранилище по уникальному идентификатору.
     */
    private void findItemById() {
        Item[] items = tracker.findAll();
        if (items.length == 0) {
            System.out.println("Еще нет ни одной заявки. Вы можете добавить заявку. Для этого введитее пункт меню 0");
        } else {
            System.out.println("Поиск заявки по идентификатору...");
            boolean found = false;
            while (!found) {
                String id = input.ask("Введите идентификатор заявки");
                Item item = tracker.findById(id);
                if (item != null && id.equals(item.getId())) {
                    System.out.println("Заявка " + item.getId() + " успешно найдена");
                    found = true;
                } else {
                    System.out.println("Завка " + id + " не найдена. Введите идентификатор заново: ");
                }
            }
        }
    }

    /**
     * Метод реализует поиск заявки в хранилище по имени заявки.
     */
    private void findItemByName() {
        Item[] items = tracker.findAll();
        if (items.length == 0) {
            System.out.println("Еще нет ни одной заявки. Вы можете добавить заявку. Для этого введитее пункт меню 0");
        } else {
            System.out.println("Поиск заявки по названию...");
            boolean found = false;
            while (!found) {
                String name = input.ask("Введите назание заявки");
                Item[] item = tracker.findByName(name);
                if (item.length == 0) {
                    System.out.println("Заявка " + name + " не найдена. Введите название заново: ");
                } else {
                    for (Item it : item) {
                        System.out.println("Заявка " + it.getName() + " успешно найдена");
                    }
                    found = true;
                }
            }
        }
    }

        private void showMenu() {
            System.out.println("Меню. Пункты:");
            System.out.println("0 - Добавить заявку");
            System.out.println("1 - Показать все заявки");
            System.out.println("2 - Редактировать заявку");
            System.out.println("3 - Удалить заявку");
            System.out.println("4 - Найти заявки по уникальному идентификатору");
            System.out.println("5 - Найти заявки по названию");
            System.out.println("6 - Выйти из программы");
        }

        /**
         * Запускт программы.
         * @param args
         */
        public static void main(String[]args) {
            new StartUI(new ConsoleInput(), new Tracker()).init();
        }
    }
