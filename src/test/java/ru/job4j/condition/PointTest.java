package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distanceTest() {
        int inX1 = 1, inX2 = 3, inY1 = 3, inY2 = 7;
        double expected = 4.47;
        double out = Point.distance(inX1, inY1, inX2, inY2);
        out = Math.round(out * 100.0) / 100.0;
    }
}