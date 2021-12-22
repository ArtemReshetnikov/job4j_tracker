package ru.job4j.tracker;

import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.*;

public class ItemAscByNameTest {

    @Test
    public void compare() {
        List<Item> items = Arrays.asList(
        new Item("Benicio"),
        new Item("Lea"),
        new Item("Bill")
        );
        List<Item> expected = Arrays.asList(
        new Item("Benicio"),
        new Item("Bill"),
        new Item("Lea")
        );
        Collections.sort(items, new ItemAscByName());
        assertEquals(items, expected);
    }

    @Test
    public void compareMore() {
        List<Item> items = Arrays.asList(
                new Item("Andrei", 1),
                new Item("Ginger", 2),
                new Item("Anton", 3),
                new Item("August", 4),
                new Item("Marico", 5)
        );
        List<Item> expected = Arrays.asList(
                new Item("Benicio", 1),
                new Item("Bill", 3),
                new Item("Lea", 2)
        );
        Collections.sort(items, new ItemAscByName());
        assertNotEquals(items, expected);
    }
}