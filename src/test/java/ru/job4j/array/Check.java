package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 1; index < data.length; index++) {
            if (data[index - 1] == data[index]) {
                return result;
            } else {
                result = false;
                return result;
            }
        }
        return result;
    }
}
