package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author inna.timonova (ms.timonovai@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("Hello", "He");
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("Hello", "Hi");
        assertThat(result, is(false));
    }
    @Test
    public void whenStartWithPrefThenTrue() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("Goodbye", "Good");
        assertThat(result, is(true));
    }
    @Test
    public void whenNotStartWithPrefThenFalse() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("Goodbye", "God");
        assertThat(result, is(false));
    }
}