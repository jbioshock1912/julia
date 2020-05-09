package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int firstAndSecondComp = first >= second ? first : second;
        int result = firstAndSecondComp >= third ? firstAndSecondComp : third;
        return result;
    }
}
