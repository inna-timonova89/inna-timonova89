package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author inna.timonova (ms.timonovai@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class MaxTest {
    @Test
    public void whenMaxRight2To4ThenRight2() {
        Max mx = new Max();
        int result = mx.max(1, 2, 3);
        int result2 = mx.max(3, 5, 1, 0);
        assertThat(result, is(3));
        assertThat(result2, is(5));
    }
    @Test
    public void whenMaxLeft1To4thenLeft1() {
        Max mx = new Max();
        int result = mx.max(5, 1, 0);
        int result2 = mx.max(0, 9, 5, 77);
        assertThat(result, is(5));
        assertThat(result2, is(77));
    }
    @Test
    public void whenMaxEachTo4ThenAny() {
        Max mx = new Max();
        int result = mx.max(3, 3, 3);
        int result2 = mx.max(8, 8, 8, 8);
        assertThat(result, is(3));
        assertThat(result2, is(8));
    }
}