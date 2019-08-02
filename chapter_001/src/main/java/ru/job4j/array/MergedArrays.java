package ru.job4j.array;

/**
 * @author inna.timonova (ms.timonovai@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class MergedArrays {
    public int[] merge(int[] left, int[] right) {
        int leftInd = 0;
        int rightInd = 0;
        int[] merged = new int[left.length + right.length];
        for (int min = 0; min < merged.length; min++) {
            if (rightInd >= right.length) {
                merged[min] = left[leftInd];
                leftInd++;
                continue;
            } else if (leftInd >= left.length) {
                merged[min] = right[rightInd];
                rightInd++;
                continue;
            }
            if (left[leftInd] < right[rightInd]) {
                merged[min] = left[leftInd];
                leftInd++;
            } else if (right[rightInd] < left[leftInd]) {
                merged[min] = right[rightInd];
                rightInd++;
            }
        }
        return merged;
    }
}
