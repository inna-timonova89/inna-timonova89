package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author inna.timonova (ms.timonovai@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter calc = new Counter();
        int result = calc.add(1, 10);
        assertThat(result, is(30));
    }
    @Test
    public void whenSumEvenNumbersFromOneToFifteenThenThirtySix() {
        Counter calc = new Counter();
        int result = calc.add(10, 15);
        assertThat(result, is(36));
    }
}