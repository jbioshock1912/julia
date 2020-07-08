package ru.job4j.condition;

public class Triangle {

    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double period(double a, double b, double c) {
        double halfPerimeter;
        halfPerimeter = (a + b + c) / 2;
        return halfPerimeter;
    }

    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        double area;
        if (this.exist(a, b, c)) {
            area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            return area;
        } else {
            return -1;
        }
    }


    private boolean exist(double a, double c, double b) {
        boolean realTriangle = true;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        if ((ab + ac) > bc || (ab + bc) > ac || (ac + bc) > ab) {
            return realTriangle;
        }
        return false;
    }
}
