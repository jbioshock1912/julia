package ru.job4j.myproject;

import ru.job4j.storage.Item;

public class FindByNameAction implements  UserAction {
    @Override
    public String name() {
        return "=== find by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) throws Exception {
        String name = input.askStr("enter name");
        Item[] result = (tracker.findByName(name)).toArray(new Item[0]);
        for (Item value : result
        ) {
            System.out.println(value);
        }
        return true;
    }
}
