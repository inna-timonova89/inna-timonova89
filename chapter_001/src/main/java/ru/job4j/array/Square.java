package ru.job4j.array;

/**
 * @author inna.timonova (ms.timonovai@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < rst.length; i++) {
            int j = i + 1;
            rst[i] = j * j;
        }
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        return rst;
    }
}
