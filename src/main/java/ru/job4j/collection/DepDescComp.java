package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String firstString, String secondString) {
        String[] leftArray = firstString.split("/");
        String[] rightArray = secondString.split("/");
        int sizeForIndex = leftArray.length <= rightArray.length ? leftArray.length : rightArray.length;
        int compareResult = 0;

        for (int i = 0; i < sizeForIndex; i++) {
            compareResult = leftArray[i].compareTo(rightArray[i]) * (-1);
            if (!(compareResult == 0)) {
                break;
            }
        }
        if (compareResult == 0 && leftArray.length != rightArray.length) {
            compareResult = leftArray.length < rightArray.length ? 1 : -1;
        }
        return compareResult;
    }
}


