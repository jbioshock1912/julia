package ru.job4j.myproject;

public class DeleteItemAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) throws Exception {
        String id = input.askStr("Enter id");
        if (tracker.delete(id)) {
            return true;
        }
        System.out.println("error");
        return false;
    }
}
