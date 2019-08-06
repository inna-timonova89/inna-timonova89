package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author inna.timonova (ms.timonovai@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class SquareTest {
    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square sqw = new Square();
        int[] rst = sqw.calculate(bound);
        int[] expect = new int[] {1, 4, 9};
        assertThat(rst, is(expect));
    }
    @Test
    public void whenBound4Then14916() {
        int bound = 4;
        Square sqw = new Square();
        int[] rst = sqw.calculate(bound);
        int[] expect = new int[] {1, 4, 9, 16};
        assertThat(rst, is(expect));
    }
    @Test
    public void whenBound5Then1491625() {
        int bound = 5;
        Square sqw = new Square();
        int[] rst = sqw.calculate(bound);
        int[] expect = new int[] {1, 4, 9, 16, 25};
        assertThat(rst, is(expect));
    }
}