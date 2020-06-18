package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("barsik");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("vaska");
        black.show();
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void show() {
        System.out.println(this.food + ", " + this.name);

    }

    public String sound() {
        String voice = "may-may";
        return voice;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }
}
