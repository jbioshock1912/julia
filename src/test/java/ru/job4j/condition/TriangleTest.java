/*

package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TriangleTest {

   @Test
    public void whenExist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }

    @Test
    public void whenNoExist() {
        boolean result = Triangle.exist(1.0, 2.0, 4.0);
        assertThat(result, is(false));
    }

    @Test
    public void periodTest() {
        Triangle check = createDefaultTriangle();
        double result = check.period(4.0, 4.0, 4.0);
        assertThat(result, is(6.0));

    }

    @Test
    public void area() {
        Triangle check = createDefaultTriangle();
        double result = check.area();
        //assertThat(result, is(8.0));

    }

    public Triangle createDefaultTriangle() {
        Point a = new Point(3, 2);
        Point b = new Point(3, 6);
        Point c = new Point(7, 6);

        double ab = a.distance(b);
        double ac = a.distance(c);
        double bc = b.distance(c);

        Triangle testTriangle = new Triangle(a, b, c);

        return testTriangle;
    }
}
*/
