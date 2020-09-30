package ru.job4j.stragery;

public class Paint {
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square.draw());

        Triangle triangle = new Triangle();
        System.out.println(triangle.draw());
    }
}
