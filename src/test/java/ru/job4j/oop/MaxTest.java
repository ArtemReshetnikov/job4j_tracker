package ru.job4j.oop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MaxTest {

    @Test
    public void when2numbers() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void when3numbers() {
        int result = Max.max(9, 1, 1);
        assertThat(result, is(9));
    }

    @Test
    public void when4numbers() {
        int result = Max.max(101, 202, 303, 404);
        assertThat(result, is(404));
    }
}