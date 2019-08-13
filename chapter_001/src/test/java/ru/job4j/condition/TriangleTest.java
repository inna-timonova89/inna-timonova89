package ru.job4j.condition;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Categories;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;


public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        Point pnt1 = new Point(0, 0);
        Point pnt2 = new Point(0, 2);
        Point pnt3 = new Point(2, 0);
        Triangle trngl = new Triangle(pnt1, pnt2, pnt3);
        double result = trngl.area();
        double expected = 2D;
        assertThat(result, closeTo(expected, 0.1));
    }
}
