package ru.job4j.inheritance;

import java.util.Date;

public class Programmer extends Engineer {
    private Smart smart;

    public Programmer(String name, String surname, String education, Date birthday, boolean lenovoThinkpad, Smart smart) {
        super(name, surname, education, birthday, lenovoThinkpad);
        this.smart = smart;
    }

    public Smart getSmart() {
        return smart;
    }
}