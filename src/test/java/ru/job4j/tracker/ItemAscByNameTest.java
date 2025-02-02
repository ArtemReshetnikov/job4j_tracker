package ru.job4j.tracker;

import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.*;

public class ItemAscByNameTest {

    @Test
    public void whenSortItemByNameAsc() {
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
}