package ru.job4j.inheritance;

import java.util.Date;

public class Engineer extends Profession {
    private boolean lenovoThinkpad;

    public Engineer(String name, String surname, String education, Date birthday, boolean lenovoThinkpad) {
        super(name, surname, education, birthday);
        this.lenovoThinkpad = lenovoThinkpad;
    }

    public boolean islenovoThinkpad() {
        return lenovoThinkpad;
    }
}
