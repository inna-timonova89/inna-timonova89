package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int value, int price) {
        value -= price;
        int[] rsl = new int[value / 10 + 1];
        int[] coins = new int[]{10, 5, 2, 1};
        int iter = 0;
        for (int coin : coins) {
            while (value - coin >= 0) {
                rsl[iter++] = coin;
                value -= coin;
            }
        }
        return Arrays.copyOf(rsl, iter);
    }
}