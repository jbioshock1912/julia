package ru.job4j.myproject;

public class ValidateInput extends ConsoleInput {
    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.askInt(question);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter validate data again.");
            }
        } while (invalid);
        return value;
    }

    @Override
    public int askInt(String question, int max) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.askInt(question, max);
                invalid = false;
            } catch (IllegalStateException moe) {
                System.out.println("Please select key from menu.");
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter validate data again.");
            }
        } while (invalid);
        return value;
    }
/*
    public static void main(String[] args) throws Exception {
        Input validate = new ValidateInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction()
        };
        new StartUI().init(validate, tracker, actions);
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) throws Exception {
        boolean run = true;
        int max = actions.length;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("question", max);
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }*/
}
