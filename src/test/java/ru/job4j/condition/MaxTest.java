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


    @Test
    public void whenMaxThirdThen10() {

        int result = Max.max(2, 1, 10);
        assertThat(result, is(10));
    }

    @Test
    public void whenMaxSecondThen11() {

        int result = Max.max(2, 11, 5);
        assertThat(result, is(11));
    }




    @Test
    public void whenMaxFourthThen10() {
        int result = Max.max(2, 9, 5, 10);
        assertThat(result, is(10));
    }

    @Test
    public void whenMaxFirstThen20() {
        int result = Max.max(20, 9, 5, 10);
        assertThat(result, is(20));
    }
}