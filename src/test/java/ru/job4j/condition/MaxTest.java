package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax3To4Then4() {
        int result = Max.max(3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax3To3Then3() {
        int result = Max.max(3, 3);
        assertThat(result, is(3));
    }
}