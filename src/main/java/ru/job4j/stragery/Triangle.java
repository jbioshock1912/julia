package ru.job4j.stragery;

import java.util.StringJoiner;

public class Triangle implements Shape {
    @Override
    public String draw() {
        StringJoiner picTriangle = new StringJoiner(System.lineSeparator());
        picTriangle.add("   +    ");
        picTriangle.add("  +++   ");
        picTriangle.add(" +++++  ");
        picTriangle.add("++++++++  ");
        return picTriangle.toString();
    }
}
