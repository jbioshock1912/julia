package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        boolean realTriangle = false;
        realTriangle = (ab + ac) > bc && (ab + bc) > ac && (ac + bc) > ab ? true : false;
        return realTriangle;
    }
}
