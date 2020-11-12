package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String originWords : origin) {
            check.add(originWords);
        }
        for (String duplicateWords : text) {
            if (!check.contains(duplicateWords)) {
                return false;
            }
        }
        return true;
    }
}
