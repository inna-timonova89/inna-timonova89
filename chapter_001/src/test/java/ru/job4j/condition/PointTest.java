package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void whenZeroAndTenThenTen() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 10);
        Point third = new Point(0, 0, 0);
        Point fourth = new Point(0, 0, 10);
        double result = first.distance(second);
        double result2 = third.distance3d(fourth);
        first.info();
        second.info();
        third.info();
        fourth.info();
        System.out.println(String.format("Result is %s", result));
        System.out.println(String.format("Result is %s", result2));
        assertThat(result, is(10D));
        assertThat(result2, is(10D));
    }

    @Test
    public void whenCheckItself() {
        Point point = new Point(0, 0);
        double result = point.distance(point);
        assertThat(result, is(0D));
        Point point2 = new Point(0, 0, 10);
        double result2 = point2.distance3d(point);
        assertThat(result2, is(10D));
    }

    @Test
    public void whenShowInfo() {
        Point first = new Point(1, 1);
        first.info();
        Point second = new Point(2, 2);
        second.info();
        Point third = new Point(1, 3, 5);
        third.info2();
        Point fourth = new Point(2, 4, 6);
        fourth.info2();
    }
}