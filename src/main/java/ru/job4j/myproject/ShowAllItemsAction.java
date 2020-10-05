package ru.job4j.myproject;

import ru.job4j.storage.Item;

public class ShowAllItemsAction implements UserAction {
    @Override
    public String name() {
        return "=== Show all items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        for (Item value : items
        ) {
            System.out.println(value);
        }
        return true;
    }
}
