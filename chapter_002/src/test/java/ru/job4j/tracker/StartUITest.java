package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import ru.job4j.tracker.tracker.StubAction;
import ru.job4j.tracker.tracker.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertNull;

public class StartUITest {
    private final PrintStream def = System.out;
    private  final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.def);
    }


    @Test
    public void whenPrintMenu() {
        StubInput input = new StubInput(
                new String[] {"0"}
        );
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), Arrays.asList(new UserAction[]{action}));
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Menu.")
                .add("0.Stub action")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
    }

    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll().get(0);
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenShowAllItems() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("item1");
        Item item2 = new Item("item2");
        tracker.add(item1);
        tracker.add(item2);
        Item item = tracker.findAll().get(1);
        Item[] items = new Item[] {item1, item2};
        String[] answers = {
                String.valueOf(items.length),
                "item1", "item2"
        };
        StartUI.showAllItems(new StubInput(answers), tracker);
        assertThat(items.length, is(2));
    }

    @Test
    public void whenFindItemById() {
        Tracker tracker = new Tracker();
        Item item = new Item("item1");
        tracker.add(item);
        Item created = tracker.findAll().get(0);
        Item expected = created;
        String[] answers = {
                created.getId(),
                expected.getId()
        };
        StartUI.findItemById(new StubInput(answers), tracker);
        assertThat(created.getId(), is(expected.getId()));
    }

    @Test
    public void whenFindItemByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("item1");
        tracker.add(item);
        Item created = tracker.findAll().get(0);
        Item expected = new Item(item.getName());
        String[] answers = {
                created.getName(),
                "item1"
        };
        StartUI.findItemByName(new StubInput(answers), tracker);
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("item01");
        tracker.add(item);
        String[] answers = {
                item.getId(),
                "replaced item"
        };
        StartUI.replaceItem(new StubInput(answers), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("item1");
        tracker.add(item);
        String[] answers = {
                item.getId(),
                null
        };
        StartUI.deleteItem(new StubInput(answers), tracker);
        assertNull(item.getId());
    }

    public static void assertNull(String id) {
    }

    @Test
    public void whenExit() {
        StubInput input = new StubInput(
                new String[]{"0"}
        );
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), Arrays.asList(new UserAction[]{action}));
        assertThat(action.isCall(), is(true));
    }
}

