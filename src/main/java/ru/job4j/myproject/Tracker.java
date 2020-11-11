package ru.job4j.myproject;

import ru.job4j.storage.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Tracker {

    /*private final Item[] items = new Item[100];*/
    private final ArrayList<Item> items = new ArrayList<Item>();
    private int position = 0;

    public ArrayList<Item> add(Item item) {
        item.setId(generateId());
        items.add(item);
        return items;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public ArrayList<Item> findAll() {
        ArrayList<Item> itemsWithoutNull = new ArrayList<Item>();
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index) != null) {
                itemsWithoutNull.add(items.get(index));
            }
        }
        return itemsWithoutNull;
    }

    public ArrayList<Item> findByName(String key) {
        ArrayList<Item> keep = new ArrayList<Item>();
        for (Item value : items
        ) {
            if (value.getName().equals(key)) {
                 keep.add(value);
            }
        }
        return keep;
    }

    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(String id, Item item) throws Exception {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1) {
            items.set(index, item);
            return true;
        } else {
            result = false;
        }
        return false;
    }

    public boolean delete(String id) throws Exception {
        int index = indexOf(id);
        if (index == -1) {
            return false;
        }
        items.remove(index);
        return true;
    }
}