package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void whenZeroAndTenThenTen() {
        Point dstn = new Point();
        double result = dstn.distance(0, 0, 0, 10);
        assertThat(result, is(10D));
    }
}