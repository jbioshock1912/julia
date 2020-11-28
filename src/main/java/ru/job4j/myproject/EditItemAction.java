package ru.job4j.myproject;

import ru.job4j.storage.Item;

public class EditItemAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) throws Exception {
        String id = input.askStr("Enter id");
        if (tracker.replace(id, new Item())) {
            return true;
        }
        System.out.println("error");
        return false;
    }
}
