package pseudo;

import ru.job4j.stragery.Paint;
import ru.job4j.stragery.Square;
import ru.job4j.stragery.Triangle;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author inna.timonova (ms.timonovai@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class PaintTest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

        @Before
        public void loadOutput() {
            System.out.println("Execute before method");
            System.setOut(new PrintStream(this.out));
        }

            @After
            public void backOutput() {
                System.setOut(this.stdout);
                System.out.println("Execute after method");
            }

        @Test
        public void whenDrawSquare() {
            new Paint().draw(new Square());
            assertThat(new String(out.toByteArray()),
                    is(
                            new StringBuilder()
                                    .append("+++++++")
                                    .append(System.lineSeparator())
                                    .append("+++++++")
                                    .append(System.lineSeparator())
                                    .append("+++++++")
                                    .append(System.lineSeparator())
                                    .append("+++++++")
                                    .append(System.lineSeparator())
                                    .toString()
                    ));
            System.setOut(stdout);
        }

        @Test
        public void whenDrawTriangle() {
            new Paint().draw(new Triangle());
            assertThat(
                    new String(out.toByteArray()),
                    is(
                            new StringBuilder()
                                    .append("   +  ")
                                    .append(System.lineSeparator())
                                    .append("  +++ ")
                                    .append(System.lineSeparator())
                                    .append(" +++++")
                                    .append(System.lineSeparator())
                                    .append("+++++++")
                                    .append(System.lineSeparator())
                                    .toString()
                    )
            );
            System.setOut(stdout);
        }
}
