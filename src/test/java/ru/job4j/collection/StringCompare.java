package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        char[] leftArray = left.toCharArray();
        char[] rightArray = right.toCharArray();

        int sizeForIndex = leftArray.length <= rightArray.length ? leftArray.length : rightArray.length;
        int compareResult = 0;

        for (int i = 0; i < sizeForIndex; i++) {
            compareResult = Character.compare(leftArray[i], rightArray[i]);
            if (!(compareResult == 0)) {
                break;
            }
        }
        if (compareResult == 0 && leftArray.length != rightArray.length) {
            compareResult = leftArray.length < rightArray.length ? -1 : 1;
        }
        return compareResult;
    }
}
