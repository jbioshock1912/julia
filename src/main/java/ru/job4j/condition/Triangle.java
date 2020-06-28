package ru.job4j.condition;

public class Triangle {

    /*public static void main(String[] args) {

        Point a = new Point(3, 1);
        Point b = new Point(3, 4);
        Point c = new Point(6, 4);

        double ab = a.distance(b);
        double ac = a.distance(c);
        double bc = b.distance(c);

        Triangle testTriangle = new Triangle(a, b, c);


        if (testTriangle.exist(ab, ac, bc)) {
            double halfPerimetr = testTriangle.period(ab, ac, bc);
            double testArea = testTriangle.area();
            System.out.println(halfPerimetr + " " + testArea);

        }


    }*/

    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     * Метод вычисления периметра по длинам сторон.
     * <p>
     * Формула.
     * <p>
     * (a + b + c) / 2
     *
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return Периметр.
     */
    public double period(double a, double b, double c) {
        double halfPerimeter;
        halfPerimeter = (a + b + c) / 2;
        return halfPerimeter;
    }

    /**
     * Метод должен вычислить площадь треугольника.
     * <p>
     * Формула.
     * <p>
     * √ p *(p - ab) * (p - ac) * (p - bc)
     * <p>
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * @return Вернуть площадь, если треугольник существует или -1.
     */
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

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     * <p>
     * Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
     *
     * @param a Длина от точки a b.
     * @param b Длина от точки a c.
     * @param c Длина от точки b c.
     * @return
     */
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
