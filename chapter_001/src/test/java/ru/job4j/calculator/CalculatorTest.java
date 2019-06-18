package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest  {
    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void WhenSubstract2From3Then1(){
        Calculator calc = new Calculator();
        double result = calc.substract(3D, 2D);
        double expected = 1D;
        assertThat(result, is(expected));
    }

    @Test
    public void WhenMultiple2To2Then4(){
        Calculator calc = new Calculator();
        double result = calc.multiple(2D, 2D);
        double expected = 4D;
        assertThat(result, is(expected));
    }

    @Test
    public void WhenDiv6To2Then3() {
        Calculator calc = new Calculator();
        double result = calc.div(6D, 2D);
        double expected = 3D;
        assertThat(result, is(expected));
    }
}