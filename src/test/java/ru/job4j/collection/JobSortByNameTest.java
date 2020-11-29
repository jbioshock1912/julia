package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.*;

public class JobSortByNameTest {

    @Test
    public void compare() {
        Comparator<Job> compareJobSortByName = new JobSortByName();
        int result = compareJobSortByName.compare(new Job("A", 55),
                new Job("B", 55));
        assertTrue(result < 0);
    }
}