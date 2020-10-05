package ru.job4j.myproject;

public class FindItemByIdAction implements UserAction {
    @Override
    public String name() {
        return "=== find item by id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) throws Exception {
        String id = input.askStr("Enter id");
        System.out.println(tracker.findById(id));
        return true;
    }
}
