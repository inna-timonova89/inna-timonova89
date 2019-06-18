package ru.job4j.calculator;

/**
 *CalculatorTest
 *@since 17.06.2019.
 *@author inna.timonova (ms.timonovai@mail.ru)
 */

public class Calculator {
    /**
     * Method add.
     * return sum.
     */
    public double add(double first, double second) {
        return first + second;
    }

    /**
     * Method substract.
     * return remainder.
     */
    public double substract(double first, double second) {
        return first - second;
    }

    /**
     * Method multiple.
     * return the product of first and second.
     */
    public double multiple(double first, double second) {
        return first * second;
    }

    /**
     * Method division.
     * return the ratio of first and second.
     */
    public double div(double first, double second) {
        return first / second;
    }
}
