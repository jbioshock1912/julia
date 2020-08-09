package ru.job4j.storage;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = false;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ===");
                Item[] items = tracker.findAll();
                for (Item value : items
                ) {
                    System.out.println(value);
                }

            } else if (select == 2) {
                System.out.println("=== Edit item ===");
                System.out.println("Enter id");
                String id = scanner.nextLine();
                if (tracker.replace(id, new Item())) {
                    return;
                } else {
                    System.out.println("error");
                }

            } else if (select == 3) {
                System.out.println("=== Delete item ===");
                System.out.println("enter id");
                String id = scanner.nextLine();
                if (tracker.delete(id)) {
                    return;
                } else {
                    System.out.println("error");
                }
            } else if (select == 4) {
                System.out.println("=== find item by id ===");
                System.out.println("enter id");
                String id = scanner.nextLine();
                System.out.println(tracker.findById(id));
            } else if (select == 5) {
                System.out.println("=== find by name ===");
                System.out.println("enter name");
                String name = scanner.nextLine();
                System.out.println(tracker.findByName(name));

            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu. 0. Add new Item\n"
                + "1. Show all items\n"
                + "2. Edit item\n"
                + "3. Delete item\n"
                + "4. Find item by Id\n"
                + "5. Find items by name\n"
                + "6. Exit Program\n"
                + "Select");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
        StartUI start = new StartUI();
        start.showMenu();
        start.init(scanner, tracker);
    }
}
