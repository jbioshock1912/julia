package ru.job4j.myproject;

import org.hamcrest.Matcher;
import org.junit.Test;
import ru.job4j.storage.Item;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/* public class StartUITest {

    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createNewItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenDeleteItem() throws Exception {
        Tracker tracker = new Tracker();
        Item item = new Item("test");
        tracker.add(item);
        Item created = tracker.findAll()[0];
        String findId = created.getId();
        String[] answers = {findId};
        Input input = new StubInput(answers);
        StartUI.deleteItem(tracker, input);
        Item[] expected = tracker.findAll();
        assertThat(expected.length, is((0)));
    }


    @Test
    public void whenFindByName() {
        String[] answers = {"julia"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createNewItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("julia");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenFindItemById() {
        String[] answers = {"julia"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createNewItem(input, tracker);
        Item created = tracker.findAll()[0];
        String findId = created.getId();
        assertThat(created.getId(), is(findId));
    }
} */