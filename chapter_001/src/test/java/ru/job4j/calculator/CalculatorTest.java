package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * CalculatorTest
 * @since 17.06.2019.
 *@author inna.timonova (ms.timonovai@mail.ru)
 */

public class CalculatorTest  {
    /**
     * Method whenAddOnePlusOneThenThenTwo
     * Asserts that two doubles are equal
     */
    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
     * Method WhenSubstract2From3Then1
     * Asserts that two doubles are equal
     */
    @Test
    public void WhenSubstract2From3Then1(){
        Calculator calc = new Calculator();
        double result = calc.substract(3D, 2D);
        double expected = 1D;
        assertThat(result, is(expected));
    }
    /**
     * Method WhenMultiple2To2Then4
     * Asserts that two doubles are equal
     */
    @Test
    public void WhenMultiple2To2Then4(){
        Calculator calc = new Calculator();
        double result = calc.multiple(2D, 2D);
        double expected = 4D;
        assertThat(result, is(expected));
    }
    /**
     * Method WhenDiv6To2Then3
     * Asserts that two doubles are equal
     */
    @Test
    public void WhenDiv6To2Then3() {
        Calculator calc = new Calculator();
        double result = calc.div(6D, 2D);
        double expected = 3D;
        assertThat(result, is(expected));
    }
}