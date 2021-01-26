package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftArray = left.split(". ");
        String[] rightArray = right.split(". ");
        int compareResult = 0;
        String[] leftArrayNumbers, rightArrayNumbers;

        if (leftArray[0].indexOf(".") == -1) {
            leftArrayNumbers = new String[1];
            leftArrayNumbers[0] = leftArray[0];
        } else {
            leftArrayNumbers = leftArray[0].split(".");
        }

        if (rightArray[0].indexOf(".") == -1) {
            rightArrayNumbers = new String[1];
            rightArrayNumbers[0] = rightArray[0];
        } else {
            rightArrayNumbers = rightArray[0].split(".");
        }

        int[] leftResult = converterStringArrayToNumber(leftArrayNumbers);
        int[] rightResult = converterStringArrayToNumber(rightArrayNumbers);

        int sizeForIndex = leftResult.length <= rightResult.length ? leftResult.length : rightResult.length;
        for (int i = 0; i < sizeForIndex; i++) {
            compareResult = leftResult[i] - rightResult[i];

            if (!(compareResult == 0)) {
                break;
            }

            if (compareResult == 0 && leftResult.length != rightResult.length) {
                compareResult = leftResult.length < rightResult.length ? -1 : 1;
            }
        }
        return compareResult;
    }


    public static int[] converterStringArrayToNumber(String[] array) {
        int[] resultArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            resultArray[i] = Integer.parseInt(array[i]);
        }
        return resultArray;
    }
}

