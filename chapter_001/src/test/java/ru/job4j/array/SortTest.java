package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author inna.timonova (ms.timonovai@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class SortTest {
    @Test
    public void whenSortedArrayThenTrue() {
        Sort sort = new Sort();
        int[] input = new int[] {1, 2, 3};
        boolean result = sort.isSorted(input);
        assertThat(result, is(true));
    }
    @Test
    public void whenArrayIsSortedThetrue() {
        Sort sort = new Sort();
        int[] input = new int[] {1, 10, 100};
        boolean result = sort.isSorted(input);
        assertThat(result, is(true));
    }
    @Test
    public void whenNotSortedArraythenFalse() {
        Sort sort = new Sort();
        int[] input = new int[] {10, 1, 100};
        boolean result = sort.isSorted(input);
        assertThat(result, is(false));
    }
    @Test
    public void whenArrayIsNotSortedThenFalse() {
        Sort sort = new Sort();
        int[] input = new int[] {100, 1, 10};
        boolean result = sort.isSorted(input);
        assertThat(result, is(false));
    }
}
