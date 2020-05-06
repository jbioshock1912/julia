package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenK3P16ThenSquare12() {
        double inIndex = 3;
        double inPerimeter = 16;
        double expected = 12;
        double out = SqArea.square(inPerimeter, inIndex);
        Assert.assertEquals(expected, out, 0.01);
    }
}