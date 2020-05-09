package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void answerTest() {
        String inHey = "Привет, Бот.";
        String inBye = "Пока.";
        String inWord = "Лалаллала";
        String expectedHey = "Привет, умник.";
        String expectedBye = "До скорой встречи.";
        String expectedWord = "Это ставит меня в тупик. Задайте другой вопрос.";

    }
}