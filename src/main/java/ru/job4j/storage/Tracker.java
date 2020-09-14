package ru.job4j.storage;

import java.util.Arrays;
import java.util.Random;

public class Tracker {

    private final Item[] items = new Item[100];
    private int position = 0;

    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item[] findAll() {
        Item[] itemsWithoutNull = new Item[items.length];
        int size = 0;
        for (int index = 0; index < items.length; index++) {
            Item temp = items[index];
            if (temp != null && temp.getName() != null) {
                itemsWithoutNull[size] = temp;
                size++;
            }
        }
        itemsWithoutNull = Arrays.copyOf(itemsWithoutNull, size);
        return itemsWithoutNull;
    }

    public Item[] findByName(String key) {
        Item[] keep = new Item[position];
        int size = 0;
        for (int index = 0; index < position; index++) {
            Item temp = items[index];
            String name = items[index].getName();
            if (name != null && name.equals(key)) {
                keep[size] = temp;
                size++;
            }
        }
        keep = Arrays.copyOf(keep, size);
        return keep;
    }

    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(String id, Item item) {
        boolean result = true;
        int index = indexOf(id);
        if (index != -1) {
            items[index] = item;
            item.setId(id);
            return result;
        } else {
            result = false;
        }
        return result;
    }

    public boolean delete(String id) {
        items[indexOf(id)] = null;
        int index = indexOf(id);
        int start = index + 1;
        int distPos = index;
        int size = position - index;
        System.arraycopy(items, start, items, distPos, size);
        items[position - 1] = null;
        position--;
        return false;
    }
}