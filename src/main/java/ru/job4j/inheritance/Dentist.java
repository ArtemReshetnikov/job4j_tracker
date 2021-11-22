package ru.job4j.inheritance;

import java.util.Date;

public class Dentist extends Doctor {
    private ToothBrush toothBrush;

    public Dentist(String name, String surname, String education, Date birthday,
                   boolean glasses, ToothBrush toothBrush) {
        super(name, surname, education, birthday, glasses);
        this.toothBrush = toothBrush;
    }

    public ToothBrush gettoothBrush() {
        return toothBrush;
    }
}
