package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point start = new Point(0, 0);
        Point end = new Point(2, 0);
        int expected = 2;
        double out = start.distance(end);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when024to160then5dot7() {
        Point start = new Point(0, 2, 4);
        Point end = new Point(1, 6, 0);
        double expected = 5.7;
        double out = start.distance3d(end);
        Assert.assertEquals(expected, out, 0.1);
    }
}