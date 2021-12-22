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
                new Item("A"),
                new Item("B"),
                new Item("C")
        );
        List<Item> expected = Arrays.asList(
                new Item("C"),
                new Item("B"),
                new Item("A")
        );
        Collections.sort(items, new ItemDescByName());
        assertEquals(items, expected);
    }

    @Test
    public void compareMore() {
        List<Item> items = Arrays.asList(
                new Item("Andrei"),
                new Item("Ginger"),
                new Item("Anton"),
                new Item("August"),
                new Item("Marico")
        );
        List<Item> expected = Arrays.asList(
                new Item("Andrei"),
                new Item("Ginger"),
                new Item("Anton"),
                new Item("August"),
                new Item("Marico")
        );
        Collections.sort(items, new ItemDescByName());
        assertNotEquals(items, expected);
    }
}