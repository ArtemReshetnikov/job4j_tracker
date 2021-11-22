package ru.job4j.inheritance;

import java.util.Date;

public class Surgeon extends Doctor {
    private Scalpel scalpel;

    public Surgeon(String name, String surname, String education, Date birthday,
                   boolean glasses, Scalpel scalpel) {
        super(name, surname, education, birthday, glasses);
        this.scalpel = scalpel;
    }

    public Scalpel getscalpel() {
        return scalpel;
    }
}
