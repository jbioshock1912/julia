package ru.job4j.storage;

import java.util.Comparator;
import java.util.Objects;

public class Item implements Comparator<Item> {

    private String id;
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public Item() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compare(Item first, Item second) {
        return first.getName().compareTo(second.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Item item = (Item) o;
        return Objects.equals(id, item.id) && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @SuppressWarnings("checkstyle:OperatorWrap")
    @Override
    public String toString() {
        return String.format("Item{id='%s', name='%s'}", id, name);
    }
}
