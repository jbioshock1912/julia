package ru.job4j.loop;

public   class Factorial {
    private static int calc(int n) {
        int result = 1;
        if (n == 0) {
            return result;
        } else {
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
        }
        return result;
    }

    private int factorial(int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n - 1);
        return result;
    }
}
