package ru.job4j.array;

/**
 * @author inna.timonova (ms.timonovai@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Turn {
    public int[] back(int[] array) {
        int n = array.length;
        for (int index = 0; index < n / 2; index++) {
            int temp = array[n - index - 1];
            array[n - index - 1] = array[index];
            array[index] = temp;
        }
        return array;
    }
}

