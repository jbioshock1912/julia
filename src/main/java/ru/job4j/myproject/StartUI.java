package ru.job4j.myproject;

import ru.job4j.storage.Item;

public class StartUI {

    public void createNewItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public void showAllItems(Tracker tracker) {
        System.out.println("=== Show all items ===");
        Item[] items = tracker.findAll();
        for (Item value : items
        ) {
            System.out.println(value);
        }
    }

    public void editItem(Tracker tracker, Input input) throws Exception {
        System.out.println("=== Edit item ===");
        String id = input.askStr("Enter id");
        if (tracker.replace(id, new Item())) {
            return;
        } else {
            System.out.println("error");
        }
    }

    public void deleteItem(Tracker tracker, Input input) throws Exception {
        System.out.println("=== Delete item ===");
        String id = input.askStr("Enter id");
        if (tracker.delete(id)) {
            return;
        } else {
            System.out.println("error");
        }
    }

    public void findItemById(Tracker tracker, Input input) {
        System.out.println("=== find item by id ===");
        String id = input.askStr("Enter id");
        System.out.println(tracker.findById(id));
    }

    public void findByName(Tracker tracker, Input input) {
        System.out.println("=== find by name ===");
        String name = input.askStr("enter name");
        Item[] result = (tracker.findByName(name));
        for (Item value : result
        ) {
            System.out.println(value);
        }
    }


    public void init(Input input, Tracker tracker) throws Exception {
        boolean run = true;
        while (run) {
            this.showMenu();
            int numberOfMenu = input.askInt("Select: ");

            switch (numberOfMenu) {

                case 0:
                    createNewItem(input, tracker);
                case 1:
                    showAllItems(tracker);
                case 2:
                    editItem(tracker, input);
                case 3:
                    deleteItem(tracker, input);
                case 4:
                    findItemById(tracker, input);
                case 5:
                    findByName(tracker, input);
                case 6:
                    run = false;

            }
        }
    }

    private void showMenu() {
        System.out.println("Menu. \n"
                + "0. Add new Item\n"
                + "1. Show all items\n"
                + "2. Edit item\n"
                + "3. Delete item\n"
                + "4. Find item by Id\n"
                + "5. Find items by name\n"
                + "6. Exit Program\n"
                + "Select");
    }

    public static void main(String[] args) throws Exception {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
