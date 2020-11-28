package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> convertedNumbers = new ArrayList<>();
        for (var value : list) {
            for (var secondValue : value) {
                convertedNumbers.add(secondValue);
            }
        }
        return convertedNumbers;
    }

    public static void main(String[] args) {
        List<String[]> names = new ArrayList<>();
        names.add(new String[]{"Petr", "Arsentev"});
        for (String[] row : names) {
            for (String cell : row) {
                System.out.println(cell);
            }
        }
    }
}
