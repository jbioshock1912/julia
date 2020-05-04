package ru.job4j.calculator;



    public class Converter {

        public static int rubleToEuro(int value) {
            int rsl = value / 70;
            return rsl;
        }

        public static int rubleToDollar(int value) {
            int rsl = value / 60; // формула перевода рублей в доллоры.
            return rsl;
        }

        public static void main(String[] args) {
            int euro = Converter.rubleToEuro(140);
            int dollar = Converter.rubleToDollar(180);
            System.out.println("140 rubles are " + euro + " euro.");
            System.out.println("140 rubles are " + dollar + " dollars");
            int expectedEuro = 2;
            int expectedDollar = 3;
            boolean passedEuro = expectedEuro == euro;
            boolean passedDollar = expectedDollar == dollar;
            System.out.println("140 rubles are 2 euro. Test result : " + euro);
            System.out.println("140 rubles are 3 dollars. Test result : " + dollar);
        }
    }


