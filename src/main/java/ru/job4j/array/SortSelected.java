package ru.job4j.array;

import ru.job4j.loop.FindLoop;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int indexOut = 0; indexOut < data.length; indexOut++) {

            for (int dataIndex = indexOut; dataIndex < data.length; dataIndex++) {
                int min = MinDiapason.findMin(data, dataIndex, data.length - 1);
                int index = FindLoop.indexOf(data, min, dataIndex, data.length);
                int temp = data[dataIndex];
                data[dataIndex] = min;
                data[index] = temp;
                //data[index] = data[dataIndex];
                //data[dataIndex] = min;
            }
        }
        return data;
    }
}
