package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public int enterNumber() {
        Scanner input = new Scanner(System.in);
        int gamer = Integer.valueOf(input.nextLine());
        return gamer;
    }

    public boolean checkNumber(int number) {
        return number <= 3 && number >= 1;
    }

    public static void main(String[] args) {
        Matches matches = new Matches();
        int allMatches = 11;
        System.out.println(allMatches);
        System.out.println("начальное количество спичек: 11");
        boolean winner = true;

        do {
            if (winner) {
                System.out.println("ходит 1 игрок");
            } else {
                System.out.println("ходит 2 игрок");
            }
            int numberOfMatches = matches.enterNumber();
            if (!matches.checkNumber(numberOfMatches)) {
                System.out.println("введите число от 1 до 3 включительно");
            } else {
                allMatches = allMatches - numberOfMatches;
                System.out.println(allMatches);
                winner = !winner;
            }
        } while (allMatches >= 1);
        if (!winner) {
            System.out.println("победил игрок 1");

        } else {
            System.out.println("победил игрок 2");
        }
    }
}
