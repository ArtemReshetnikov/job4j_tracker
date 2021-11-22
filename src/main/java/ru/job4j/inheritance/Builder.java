package ru.job4j.inheritance;

import java.util.Date;

public class Builder extends Engineer {
    private Project project;

    public Builder(String name, String surname, String education, Date birthday,
                   boolean lenovoThinkpad, Project project) {
        super(name, surname, education, birthday, lenovoThinkpad);
        this.project = project;
    }

    public Project getProject() {
        return project;
    }
}