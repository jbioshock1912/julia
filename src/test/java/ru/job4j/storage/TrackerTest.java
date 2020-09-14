package ru.job4j.storage;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

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

    ,..jk m @Test
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
        Item[] actual = new Item[100];
        assertThat(tracker.findByName(key)[0].getName(), is("one"));
    }

    @Test
    public void findById() {
        Tracker tracker = createTracker();
        Item[] result =  tracker.findAll();
        String testId = result[1].getId();
        Item resultId = tracker.findById(testId);
        assertThat(testId, is(result[1].getId()));
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenReplaceThenOk() {
        Tracker tracker = createTracker();
        Item[] keep = tracker.findByName("three");
        Item checkItem = keep[0];
        String id = checkItem.getId();
        Item itemForReplace = new Item("oneoneoneone");
        boolean result = tracker.replace(id, itemForReplace);
        assertTrue(result);
    }

        @Test
    public void whenDeleteThenOk() {
    }
}