package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; start <= finish; start++) {
            sum = sum + start;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; start <= finish; start++) {
            if ((start % 2) == 0) {
                sum = sum + start;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumByEven(2, 6));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
    }
}

