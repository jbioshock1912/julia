package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int inN = 5;
        int expected = 120;
        int out = Factorial.calc(inN);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int inN = 0;
        int expected = 1;
        int out = Factorial.calc(inN);

    }
}