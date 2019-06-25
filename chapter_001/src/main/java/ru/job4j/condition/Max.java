package ru.job4j.condition;

/**
 * Возвращает наибольшее число, если они не одинаковы.
 * @return Результат сравнения 2-х чисел.
 */

public class Max {
    public int max(int left, int right) {
        return (left > right) ? left : right;
    }
}
