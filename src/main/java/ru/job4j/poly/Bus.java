package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void ride() {
        System.out.println("ПОЕХАЛИ!");
    }

    @Override
    public int passengers(int number) {
        System.out.println("На борту находится " + number + " человек");
    }

    @Override
    public int fuel(int quantity) {
        int price = quantity * 2;
        System.out.println("The bus is filled to the brim");
        return price;
    }
}