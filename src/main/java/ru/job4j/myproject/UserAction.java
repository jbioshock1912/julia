package ru.job4j.myproject;

public interface UserAction {
    String name();
    boolean execute(Input input, Tracker tracker) throws Exception;
}
