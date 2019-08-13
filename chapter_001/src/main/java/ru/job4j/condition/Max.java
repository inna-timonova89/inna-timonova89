package ru.job4j.condition;

/**
 * Возвращает наибольшее число, если они не одинаковы.
 * @return Результат сравнения 4-х чисел.
 */

public class Max {
    public int max(int left1, int right1, int middle) {
        int max1 = (left1 > right1) ? left1 : right1;
        return (middle > max1) ? middle : max1;
    }
}
