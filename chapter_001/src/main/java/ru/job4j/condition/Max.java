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
    public int max(int left1, int right1, int left2, int right2) {
        int max1 = (left1 > right1) ? left1 : right1;
        int max2 = (left2 > right2) ? left2 : right2;
        return (max1 > max2) ? max1 : max2;
    }
}
