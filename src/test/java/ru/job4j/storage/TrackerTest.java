package ru.job4j.storage;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TrackerTest {

    public Tracker createTracker() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("one"));
        tracker.add(new Item("two"));
        tracker.add(new Item("three"));
        tracker.add(new Item("one"));
        tracker.add(new Item("five"));
        tracker.add(new Item());
        return tracker;
    }


    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void findAll() {
        Tracker tracker = createTracker();
        Item[] result = tracker.findAll();
        assertThat(5, is(result.length));
    }

    @Test
    public void findByName() {
        Tracker tracker = createTracker();
        String key = "one";
        Item[] result = tracker.findByName(key);
        assertThat(2, is(2));

    }

    @Test
    public void findById() {
        Tracker tracker = createTracker();

    }
}