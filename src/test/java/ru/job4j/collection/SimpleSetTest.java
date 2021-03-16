package ru.job4j.collection;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

public class SimpleSetTest {

    @Test
    public void checkDoubleTest() {
        SimpleSet<Integer> setForTest = new SimpleSet<>();
        setForTest.add(10);
        setForTest.add(20);
        assertTrue(setForTest.checkDouble(20));
    }


}