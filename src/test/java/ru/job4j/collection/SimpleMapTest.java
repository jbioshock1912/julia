package ru.job4j.collection;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SimpleMapTest {

    SimpleMap<Integer, String> simpleMap = new SimpleMap();

    @Before
    public void createMap() {
        simpleMap.insert(1, "julia");
        simpleMap.insert(2, "slava");
        simpleMap.insert(3, "kamik");
    }

    @Test
    public void insert() {
        String result = simpleMap.get(3);
        assertThat(result, is("kamik"));

    }

    @Test
    public void delete() {
        boolean result = simpleMap.delete(2);
        assertThat(result, is(true));
    }

    @Test
    public void iterator() {
        Iterator iterator = simpleMap.iterator();
        iterator.next();
        var result =  iterator.next();
        assertThat(result, is("slava"));
    }
}