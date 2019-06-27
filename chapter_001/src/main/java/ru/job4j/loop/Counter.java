package ru.job4j.loop;

/**
 * Возвращает сумму четных чисел.
 * @return Результат суммы всех четных чисел в диапазоне от 1 до 10.
 * @author inna.timonova (ms.timonovai@mail.ru)
 */
public class Counter {
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= 10; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}