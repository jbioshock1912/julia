package ru.job4j.inheritance;

public class Doctor extends Profession {

    private Diagnose illness;

    public Diagnose heal(Pacient pacient) {
        return illness;
    }

    public Diagnose getIllness() {
        return illness;
    }
}
