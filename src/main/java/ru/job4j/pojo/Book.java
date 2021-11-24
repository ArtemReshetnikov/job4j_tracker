package ru.job4j.pojo;

public class Book {
    private String title;
    private int numberofpages;

    public Book(String name, int numberofpages) {
        this.title = name;
        this.numberofpages = numberofpages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberofpages() {
        return numberofpages;
    }

    public void setNumberofpages(int numberofpages) {
        this.numberofpages = numberofpages;
    }
}
