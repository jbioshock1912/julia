package ru.job4j.myproject;

import ru.job4j.storage.Item;

import java.util.Scanner;

public class StartUI {


    public void createNewItem(Scanner scanner, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
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

    public void editItem(Tracker tracker, Scanner scanner) throws Exception {
        System.out.println("=== Edit item ===");
        System.out.println("Enter id");
        String id = scanner.nextLine();
        if (tracker.replace(id, new Item())) {
            return;
        } else {
            System.out.println("error");
        }
    }

    public void deleteItem(Tracker tracker, Scanner scanner) throws Exception {
        System.out.println("=== Delete item ===");
        System.out.println("enter id");
        String id = scanner.nextLine();
        if (tracker.delete(id)) {
            return;
        } else {
            System.out.println("error");
        }
    }

    public void findItemById(Tracker tracker, Scanner scanner) {
        System.out.println("=== find item by id ===");
        System.out.println("enter id");
        String id = scanner.nextLine();
        System.out.println(tracker.findById(id));
    }

    public void findByName(Tracker tracker, Scanner scanner) {
        System.out.println("=== find by name ===");
        System.out.println("enter name");
        String name = scanner.nextLine();
        Item[] result = (tracker.findByName(name));
        for (Item value : result
        ) {
            System.out.println(value);
        }
    }


    public void init(Scanner scanner, Tracker tracker) throws Exception {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());


            if (select == 0) {
                createNewItem(scanner, tracker);

            } else if (select == 1) {
                showAllItems(tracker);

            } else if (select == 2) {
                editItem(tracker, scanner);

            } else if (select == 3) {
                deleteItem(tracker, scanner);

            } else if (select == 4) {
                findItemById(tracker, scanner);

            } else if (select == 5) {
                findByName(tracker, scanner);

            } else if (select == 6) {
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
