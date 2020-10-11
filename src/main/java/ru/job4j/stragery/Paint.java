package ru.job4j.stragery;

public class Paint {

    public static void drawFigure(Shape shape) {
        System.out.println(shape.draw());
    }

    public static void main(String[] args) {
        Shape square = new Square();
        drawFigure(square);

        Shape triangle = new Triangle();
        drawFigure(triangle);
    }
}
