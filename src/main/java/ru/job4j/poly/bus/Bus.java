package ru.job4j.poly.bus;

public class Bus implements Transport {
    @Override
    public void toDrive() {
        System.out.println("автобус передвигается по суше");
    }

    @Override
    public void numberOfPeople(int number) {
        System.out.println("число людей в автобусе" + number);
    }

    @Override
    public double takeOil(double oil) {
        double price = 45.5;
        price = oil * price;
        return price;
    }
}
