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
    public void whenMax1To2Then2() {
        Max mx = new Max();
        int result = mx.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax2To1then2() {
        Max mx = new Max();
        int result = mx.max(2, 1);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax1To1Then1() {
        Max mx = new Max();
        int result = mx.max(1, 1);
        assertThat(result, is(1));
    }
}