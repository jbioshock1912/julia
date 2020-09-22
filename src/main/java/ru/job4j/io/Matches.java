package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfMatches = 11;
        while (numberOfMatches > 1) {
            System.out.println("ходит первый игрок");
            int selectOne = Integer.valueOf(input.nextLine());
            numberOfMatches = numberOfMatches - selectOne;
            System.out.println(numberOfMatches);
            System.out.println("ходит второй игрок");
            int selectTwo = Integer.valueOf(input.nextLine());
            numberOfMatches = numberOfMatches - selectTwo;
            System.out.println(numberOfMatches);
        }
    }
}
