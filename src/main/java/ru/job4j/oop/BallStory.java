package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball freshBall = new Ball();
        Hare greyHare = new Hare();
        Fox redFox = new Fox();
        Wolf angryWolf = new Wolf();

        greyHare.tryEat(freshBall);
        redFox.tryEat(freshBall);
        angryWolf.tryEat(freshBall);
    }
}
