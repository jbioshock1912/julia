package ru.job4j.myproject;

public class ExitAction implements UserAction {
    @Override
    public String name() {
        return "=== Exit ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) throws Exception {
        return false;
    }
}
