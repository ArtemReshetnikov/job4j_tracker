package ru.job4j.oop;

public class Aircraft implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " flies in the air");
    }

    @Override
    public void enginetype() {
        System.out.println(getClass().getSimpleName() + " has a jet engines");
    }
}
