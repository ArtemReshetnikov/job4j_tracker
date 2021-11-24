package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Johnny");
        student.setGroup("11B");
        student.setEnroll(LocalDate.of(2020, 9, 1));
        System.out.println(student.getName() + " has enrolled to group № " + student.getGroup() + " at " + student.getEnroll());
    }
}
