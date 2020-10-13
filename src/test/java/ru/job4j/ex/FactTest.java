package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenMinus() {
        Fact.countFactorial(-5);
    }

    @Test
    public void when4to2then24() {
        int rsl = Fact.countFactorial(4);
        assertThat(rsl, is(24));
    }
}