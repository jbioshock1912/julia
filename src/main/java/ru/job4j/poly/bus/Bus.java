package ru.job4j.poly.bus;

public class Bus implements Transport {
    @Override
    public void toDrive() {
    }

    @Override
    public void numberOfPeople(int number) {

    }

    @Override
    public double takeOil(double oil) {
        double price = 45.5;
        price = oil * price;
        return price;
    }
}
