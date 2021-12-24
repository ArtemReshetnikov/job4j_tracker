package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByProrityAndName() {
        Comparator<Job> cmpPriorityName = new JobDescByPriority().thenComparing(new JobDescByName());
        int rsl = cmpPriorityName.compare(
                new Job("Leon", 1),
                new Job("Leo", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByAscNameAndAscPrority() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Java", 5),
                new Job("Java", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorEqualsObjects() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("C#", 1),
                new Job("C#", 1)
        );
        assertThat(rsl, equalTo(0));
    }

    @Test
    public void whenFirstGreaterThatSecond() {
        Comparator<Job> cmpAscName = new JobAscByName();
        int rsl = cmpAscName.compare(
                new Job("Alpha"),
                new Job("Beta")
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenSecondGreaterThatFirst() {
        Comparator<Job> cmpDescName = new JobDescByName();
        int rsl = cmpDescName.compare(
                new Job("Alpha"),
                new Job("Beta")
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenSecondMPriorityThatFirst() {
        Comparator<Job> cmpDescName = new JobDescByName();
        int rsl = cmpDescName.compare(
                new Job("Alpha", 1),
                new Job("Beta", 2)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenFirstMPriorityThatSecond() {
        Comparator<Job> cmpAscName = new JobAscByName();
        int rsl = cmpAscName.compare(
                new Job("Alpha", 3),
                new Job("Beta", 2)
        );
        assertThat(rsl, greaterThan(0));
    }
}