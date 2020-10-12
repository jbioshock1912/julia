package ru.job4j.pseudo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.job4j.stragery.Paint;
import ru.job4j.stragery.Square;
import ru.job4j.stragery.Triangle;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class PaintTest {
    // поле содержит дефолтный вывод в консоль.
    private final PrintStream stdout = System.out;
    // буфер для результата.
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }
    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }
    @Test
    public void whenDrawSquare() {
        new Paint().drawFigure(new Square());
        assertThat(
                this.out.toString(),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("+++++")
                                .add("+   +")
                                .add("+   +")
                                .add("+++++")
                                .add("")
                                .toString()
                )
        );
    }
    @Test
    public void whenDrawTriangle() {
        new Paint().drawFigure(new Triangle());
        assertThat(
                this.out.toString(),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("   +    ")
                                .add("  +++   ")
                                .add(" +++++  ")
                                .add("++++++++  ")
                                .add("")
                                .toString()
                )
        );
    }
}