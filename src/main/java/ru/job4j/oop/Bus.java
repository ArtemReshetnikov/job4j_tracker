package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " moves on highways");
    }

    @Override
    public void enginetype() {
        System.out.println(getClass().getSimpleName() + " has a diesel engine");
    }
}
