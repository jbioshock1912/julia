package ru.job4j.stragery;

import org.junit.Test;

import java.util.StringJoiner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SquareTest {
    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(
                square.draw(),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("++++")
                                .add("+ +")
                                .add("+ +")
                                .add("++++")
                                .toString()
                )
        );
    }
}