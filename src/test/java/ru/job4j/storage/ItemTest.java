package ru.job4j.storage;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void compare() {
        Item first = new Item("a");
        Item second = new Item("b");
        int result = first.compare(first, second);
        assertTrue(result > 0);
    }

    @Test
    public void compareList() {
        List<Item> items = Arrays.asList(
                new Item("w"),
                new Item("a"),
                new Item("b")
        );

        System.out.println(items);
        Collections.sort(items, new Item());
        System.out.println(items);
    }
}