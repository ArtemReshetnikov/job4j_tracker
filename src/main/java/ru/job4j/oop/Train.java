package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " moves on rails");
    }

    @Override
    public void enginetype() {
        System.out.println(getClass().getSimpleName() + " has an electrical engine");
    }
}
