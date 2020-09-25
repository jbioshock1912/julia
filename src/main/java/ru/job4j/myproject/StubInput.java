package ru.job4j.myproject;

import ru.job4j.myproject.Input;

public class StubInput implements Input {

    @Override
    public String askStr(String question) {
        return null;
    }

    @Override
    public int askInt(String question) {
        return 0;
    }
}
