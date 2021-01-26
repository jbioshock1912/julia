package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> uniqDep = new HashSet<>();
        for (String departmentName : deps) {
            String start = "";
            for (String element : departmentName.split("/")) {
                start = start + (start == "" ? "" : "/") + element;
                uniqDep.add(start);
            }
        }
        return new ArrayList<>(uniqDep);
    }


    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs, Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
    }

}
