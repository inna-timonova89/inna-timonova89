package ru.job4j.loop;

/**
 * Возвращает факториал числа.
 * @return Результат умножения вспх натуральных чисел от 1 до n включительно.
 * @author inna.timonova (ms.timonovai@mail.ru)
 */
public class Factorial {
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}