package pseudo;

import ru.job4j.stragery.Square;

import org.junit.Test;

import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author inna.timonova (ms.timonovai@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class SquareTest {
    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(
                square.draw(),
                is(
                        new StringBuilder()
                        .append("+++++++")
                                .append(System.lineSeparator())
                        .append("+++++++")
                                .append(System.lineSeparator())
                        .append("+++++++")
                                .append(System.lineSeparator())
                        .append("+++++++")
                        .toString()
                )
        );
    }
}
