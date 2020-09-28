package ru.job4j.io;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Matches {

    public static  int allMatches = 11;

    public int enterNumber() {

        Scanner input = new Scanner(System.in);
        int gamer = Integer.valueOf(input.nextLine());
        return gamer;
    }

    public boolean checkNumber(int number) {
        return number <= 3 && number >= 1 && allMatches >= number;
    }

    public static void main(String[] args) {
        Matches matches = new Matches();

        System.out.println(allMatches);
        System.out.println("начальное количество спичек: 11");
        boolean winner = true;

        do {
            System.out.println(winner ? "ходит 1 игрок" : "ходит 2 игрок");
            int numberOfMatches = matches.enterNumber();
            if (!matches.checkNumber(numberOfMatches)) {
                System.out.println("введите число от 1 до 3 включительно или число не больше, чем оставшееся количество спичек");
            } else {
                allMatches = allMatches - numberOfMatches;
                System.out.println(allMatches);
                winner = !winner;
            }
        } while (allMatches >= 1);
        System.out.println(winner ? "победил игрок 2" : "победил игрок 1");
    }
}
