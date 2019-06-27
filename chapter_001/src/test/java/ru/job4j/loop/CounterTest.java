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
        Counter counter = new Counter();
        int result = counter.add(1, 10);
        assertThat(result, is(30));
        // здесь тест, проверяющий, что сумма чётных чисел от 1 до 10 при вызове метода counter.add будет равна 30.
    }
    @Test
    public void whenSumEvenNumbersFromOneToFifteenThenThirtySix() {
        Counter counter = new Counter();
        int result = counter.add(10, 15);
        assertThat(result, is(36));
        // здесь тест, проверяющий, что сумма чётных чисел от 1 до 10 при вызове метода counter.add будет равна 30.
    }
}