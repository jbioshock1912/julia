package ru.job4j.storage;

import java.util.Arrays;
import java.util.Random;

public class Tracker {

    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
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
        for (int index = 0; index < items.length; index++) {
            Item temp = items[index];
            if (items[index].getName().equals(key)) {
                keep[size] = temp;
                size++;
            }
        }
        keep = Arrays.copyOf(keep, size);
        return keep;
    }

    public Item findById(String id) {
        for (Item value : items) {
            if (value.getId().equals(id)) {
                return value;
            }
        }
        return null;
    }
}