package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.tracker.Item;
import ru.job4j.tracker.tracker.Tracker;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenItemHasIdThenTrackerHasSameId() {
        Tracker tracker = new Tracker();
        Item item = new Item("test2");
        tracker.add(item);
        item.setId("test2Id");
        tracker.findById(String.valueOf(item));
        Item result = tracker.findById(item.getId());
        assertThat(result.getId(), is(item.getId()));
    }

    @Test
    public void whenItemHasNameThenTrackerHasSameName() {
        Tracker tracker = new Tracker();
        Item one = new Item("one");
        tracker.add(one);
        Item[] result = tracker.findByName(one.getName());
        assertThat(one.getName(), is("one"));
    }

    @Test
    public void whenItemsThenTrackerHasTheseItems() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("A");
        Item item2 = new Item("B");
        Item item3 = new Item("C");
        Item item4 = new Item("D");
        Item item5 = new Item("E");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        tracker.add(item5);
        Item[] result = {item1, item2, item3, item4, item5};
        assertThat(tracker.findAll(), is(result));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1");
        tracker.add(previous);
        Item next = new Item("test2");
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void whenDeleteItemThenTrackerHasNoItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test4");
        tracker.add(item);
        item.setId("test4Id");
        tracker.delete(item.getId());
        String result = null;
        assertThat(tracker.findById(item.getId()), is(result));
    }
}
