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
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = new int[] {5, 1, 2, 7, 3};
        int[] result = bubbleSort.sort(input);
        int[] expect = new int[] {1, 2, 3, 5, 7};
        assertThat(result, is(expect));
        //напишите здесь тест, проверяющий сортировку массива из 10 элементов методом пузырька, например {1, 5, 4, 2, 3, 1, 7, 8, 0, 5}.
    }
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = new int[] {9, 5, 3, 1, 8, 10, 6, 2, 7, 4};
        int[] result = bubbleSort.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat(result, is(expect));
    }
}