package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class ItemDescByNameTest {

    @Test
    public void compare() {
        List<Item> items = Arrays.asList(
                new Item("A", 1),
                new Item("B", 2),
                new Item("C", 3)
        );
        List<Item> expected = Arrays.asList(
                new Item("C", 3),
                new Item("B", 2),
                new Item("A", 1)
        );
        Collections.sort(items, new ItemDescByName());
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
                new Item("Andrei", 1),
                new Item("Ginger", 2),
                new Item("Anton", 3),
                new Item("August", 4),
                new Item("Marico", 5)
        );
        Collections.sort(items, new ItemDescByName());
        assertNotEquals(items, expected);
    }
}