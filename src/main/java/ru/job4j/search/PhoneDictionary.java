package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person human : persons) {
            if (human.getName().contains(key) || human.getAddress().contains(key) || human.getPhone().contains(key) ||
                    human.getSurname().contains(key)) {
                result.add(human);
            }
        }
        return result;
    }
}