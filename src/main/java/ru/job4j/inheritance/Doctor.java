package ru.job4j.inheritance;

import java.util.Date;

public class Doctor extends Profession {
    private boolean glasses;

    public Doctor(String name, String surname, String education, Date birthday, boolean glasses) {
        super(name, surname, education, birthday);
        this.glasses = glasses;
    }

    public boolean isGlasses() {
        return glasses;
    }
}
