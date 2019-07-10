package ru.job4j.array;

import java.util.Arrays;

/**
 * @author inna.timonova (ms.timonovai@mail.ru)
 * @version $Id$
 * @since 0.1
 * @return array without duplicates.
 */
public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int special = array.length;
        for (int out = 0; out < special; out++) {
            for (int in = out + 1; in < special; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[special - 1];
                    special--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, special);
    }
}