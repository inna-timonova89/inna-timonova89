package ru.job4j.condition;

/**
 * SqArea
 *
 *@author inna.timonova (ms.timonovai@mail.ru)
 */

public class SqArea {
    /**
     *Main
     *@param p - perimeter.
     *@param k - the times the width id bigger than height.
     *@return square - height multipled to width.
     */
    public int square(int p, int k) {
        int h = p / (2 + 2 * k);
        int w = h * k;
        return h * w;
    }
}
