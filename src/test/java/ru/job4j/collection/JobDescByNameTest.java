package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class JobDescByNameTest {

    @Test
    public void compareJobDescByName() {
        Comparator<Job> compareJobDescByName = new JobDescByName();
        int result = compareJobDescByName.compare(new Job("A", 0),
                new Job("B", 1));
        assertTrue(result > 0);
    }
}