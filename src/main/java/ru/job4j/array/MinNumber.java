package ru.job4j.array;

public class MinNumber {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
          if (array[index] < min) {
              min = array[index];
          }
        }
        return min;
    }
}
