package ru.job4j.oop;

import org.w3c.dom.ls.LSOutput;

public class DummyDic {
    public static void main(String[] args) {
        DummyDic max = new DummyDic();
        String voice = max.engToRus("parents");
        System.out.println(voice);
    }

    public String engToRus(String eng) {
        String word = "Неизвестное слово. ";
        return word + eng;
    }

}
