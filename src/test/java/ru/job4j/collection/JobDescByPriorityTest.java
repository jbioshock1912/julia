package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.*;

public class JobDescByPriorityTest {

    @Test
    public void compare() {
        Comparator<Job> compareJobDescByPriority = new JobDescByPriority();
        int result = compareJobDescByPriority.compare(new Job("A", 55),
                new Job("B", 55));
        assertTrue(result == 0);
    }
}