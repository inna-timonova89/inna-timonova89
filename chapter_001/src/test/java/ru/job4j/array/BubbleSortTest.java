package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author inna.timonova (ms.timonovai@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class BubbleSortTest {
    @Test
    public void whenSortArrayWithFiveElementsThenSortedArray() {
        BubbleSort bubble = new BubbleSort();
        int[] input = new int[] {5, 1, 2, 7, 3};
        int[] result = bubble.sort(input);
        int[] expect = new int[] {1, 2, 3, 5, 7};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubble = new BubbleSort();
        int[] input = new int[] {9, 5, 3, 1, 8, 10, 6, 2, 7, 4};
        int[] result = bubble.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat(result, is(expect));
    }
}