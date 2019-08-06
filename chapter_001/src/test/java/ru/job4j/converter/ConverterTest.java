package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *CalculatorTest
 *@since 17.06.2019.
 *@author inna.timonova (ms.timonovai@mail.ru)
 */
public class ConverterTest {
    /**
     * Method when60RubleToDollarThen1.
     * Asserts that two ints are equal.
     */
    @Test
    public void when60RubleToDollarThen1() {
        Converter conv = new Converter();
        int result = conv.rubleToDollar(60);
        assertThat(result, is(1));
    }
    /**
     * Method when70RubleToEuroThen1.
     * Asserts that two ints are equal.
     */
    @Test
    public void when70RubleToEuroThen1() {
        Converter conv = new Converter();
        int result = conv.rubleToEuro(70);
        assertThat(result, is(1));
    }
    /**
     * Method when1DollarToRubleThen60.
     * Asserts that two ints are equal.
     */
    @Test
    public void when1DollarToRubleThen60() {
        Converter conv = new Converter();
        int result = conv.dollarToRuble(1);
        assertThat(result, is(60));
    }
    /**
     * Method when1EuroToRubleThen70.
     * Asserts that two ints are equal.
     */
    @Test
    public void when1EuroToRubleThen70() {
        Converter conv = new Converter();
        int result = conv.euroToRuble(1);
        assertThat(result, is(70));
    }
}