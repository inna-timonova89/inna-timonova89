package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.job4j.tracker.tracker.ConsoleInput;
import ru.job4j.tracker.tracker.StubInput;
import ru.job4j.tracker.tracker.ValidateInput;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ValidateInputTest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream mem = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println("Execute before method");
        System.setOut(new PrintStream(this.mem));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("Execute after method");
    }

    @Test
    public void whenInvalidInput() {
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {"invalid", "1"})
        );
        input.askInt("Enter", 1);
        assertThat(
                mem.toString(),
                is(String.format("Please enter the valid data again " + System.lineSeparator()))
        );
    }

    @Test
    public void whenInvalidKeyFromMenu() {
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {"7", "1"})
        );
        input.askInt("Enter", 6);
        assertThat(
                mem.toString(),
                is(String.format("Please select a key from the menu " + System.lineSeparator()))
        );
    }
}
