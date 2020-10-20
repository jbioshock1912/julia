package ru.job4j.myproject;

import ru.job4j.storage.Item;

public class StartUI {

    public void init(Input input, Tracker tracker, UserAction[] actions) throws Exception {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) throws Exception {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new DeleteItemAction(),
                new EditItemAction(),
                new FindByNameAction(),
                new FindItemByIdAction(),
                new ShowAllItemsAction(),
                new ExitAction()};
        new StartUI().init(input, tracker, actions);
    }
}
