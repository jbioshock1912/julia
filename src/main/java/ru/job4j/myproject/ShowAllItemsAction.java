package ru.job4j.myproject;

import ru.job4j.storage.Item;

import java.util.ArrayList;

public class ShowAllItemsAction implements UserAction {
    @Override
    public String name() {
        return "=== Show all items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        ArrayList<Item> items = tracker.findAll();
        for (Item value: items
             ) {
            System.out.println(value);

        }

        return true;
    }
}
