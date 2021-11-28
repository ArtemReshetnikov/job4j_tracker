package ru.job4j;

import ru.job4j.tracker.Item;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item("Artem", 1);
        System.out.println(item);
    }
}
