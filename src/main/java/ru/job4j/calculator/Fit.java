package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }


    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(181);
        System.out.println("Man 100 is " + man);
        double woman = Fit.womanWeight(161);
        System.out.println("Woman is " + woman);
    }
}
