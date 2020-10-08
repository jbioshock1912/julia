package ru.job4j.myproject;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StubActionTest implements UserAction {

    private boolean call = false;

    @Test
    public void whenExit() throws Exception {
        StubInput input = new StubInput(
                new String[]{"0"}
        );
        StubActionTest action = new StubActionTest();
        new StartUI().init(input, new Tracker(), new UserAction[]{action});
        assertThat(action.isCall(), is(true));
    }


    @Override
    public String name() {
        return "=== Exit ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) throws Exception {
        call = true;
        return false;
    }

    public boolean isCall() {
        return call;
    }
}