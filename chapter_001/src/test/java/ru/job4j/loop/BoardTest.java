package ru.job4j.loop;

import org.junit.Test;

import java.sql.SQLOutput;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *
 * @author inna.timonova (ms.timonovai@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class BoardTest {
    @Test
    public void when3x3() {
        Board pic = new Board();
        String rsl = pic.paint(3, 3);
        String ln = System.lineSeparator();
        assertThat(rsl, is(
                String.format("X X%s X %sX X%s", ln, ln, ln)
                )
        );
    }
    @Test
    public void when5x4() {
        Board pic = new Board();
        String rsl = pic.paint(5, 4);
        String ln = System.lineSeparator();
        assertThat(rsl, is(
                String.format("X X X%s X X %sX X X%s X X %s", ln, ln, ln, ln)
                )
        );
    }
}