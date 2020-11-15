package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        if (!(citizens.containsKey(citizen))) {
            citizens.put(citizen.getPassport(), citizen);
            return false;
        }
        return true;
    }

    public Citizen get(String passport) {
        Citizen value = citizens.get(passport);
        if (value != null) {
            return value;
        } else {
            return null;
        }
    }
}
