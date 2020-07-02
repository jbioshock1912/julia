package ru.job4j.inheritance;

public class Pacient extends Doctor {
    private String name;
    private int age;
    private String address; // как получить мне тут поле с диагнозом которое есть в классе доктор??


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public boolean solvency() {
        boolean canPay = true;
        return canPay;
    }

    public Pacient search() {
        return null;
    }
}
