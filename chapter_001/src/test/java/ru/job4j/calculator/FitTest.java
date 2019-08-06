package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class FitTest {

    @Test
    public void manWeight() {
        Fit shape = new Fit();
        double weight = shape.manWeight(180);
        assertThat(weight, closeTo(92.0, 0.1));
    }

    @Test
    public void womanWeight() {
        Fit shape = new Fit();
        double weight = shape.womanWeight(170);
        assertThat(weight, closeTo(69.0, 0.1));
    }
}