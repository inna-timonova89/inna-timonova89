package ru.job4j.condition;

/**
 * Возвращает наибольшее число, если они не одинаковы.
 * @return Результат сравнения 2-х чисел.
 */

public class Max {
    public int max(int left, int right) {
        return (left > right) ? left : right;
    }
    public int firstMax(int left, int right) {
        return (left > right) ? left : right;
    }
    public int secondMax(int left, int right) {
        return (right > left) ? right : left;
    }
    public int evenlyNum(int left, int right) {
        int sum = left + right;
        return (left == right) ? (sum - left) : (sum - right);
    }
}