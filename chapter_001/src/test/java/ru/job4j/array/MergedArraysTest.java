package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author inna.timonova (ms.timonovai@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class MergedArraysTest {
    @Test
    public void whenTwoArraysThenThirdSortedArray() {
        MergedArrays merged = new MergedArrays();
        int[] result = merged.merge(new int[] {1, 3}, new int[] {2, 4});
        int[] expect = {1, 2, 3, 4};
        assertThat(result, is(expect));
    }
    @Test
    public void whenTwoSortedArrayaThenThirdMergedArrayIsSorted() {
        MergedArrays merged = new MergedArrays();
        int[] result = merged.merge(new int[] {2, 4, 7, 9}, new int[] {1, 3, 6, 8});
        int[] expect = {1, 2, 3, 4, 6, 7, 8, 9};
        assertThat(result, is(expect));
    }
}
