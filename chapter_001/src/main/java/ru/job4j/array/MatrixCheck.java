package ru.job4j.array;

/**
 * @author inna.timonova (ms.timonovai@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        int n = data.length - 1;
        for (int i = 0; i < n; i++) {
            if (((data[i][i] != data[i + 1][i + 1]) || data[i][n - i] != data[i + 1][n - 1 - i])) {
            return false;
        }
    }
        return true;
}
}