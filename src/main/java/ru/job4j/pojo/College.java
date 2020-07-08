package ru.job4j.pojo;

import org.w3c.dom.ls.LSOutput;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        Date date = new Date();

        student.setFirstName("Julia");
        student.setLastName("Sabirova");
        student.setSecondName("Aleksandrovna");
        student.setGroup(4452);
        student.setStart(date);
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getSecondName());
        System.out.println(student.getGroup());
        System.out.println(student.getStart());
    }
}
