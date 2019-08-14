package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    /**
     * Это поле объекта. Оно доступно только конкретному объекту.
     */
    private int x;

    /**
     * И это поле объекта. Оно доступно только конкретному объекту.
     */
    private int y;

    /**
     * И это поле объекта. Оно доступно только конкретному объекту.
     */
    private int z;

    /**
     * Конструктор, который принимает начальное состояние объекта "точка"
     * @param first координата x
     * @param second координата y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public double distance(Point pnt) {
        return sqrt(pow(this.x - pnt.x, 2) + pow(this.y - pnt.y, 2));
    }

    public double distance3d(Point pnt) {
        return sqrt(pow(this.x - pnt.x, 2) + pow(this.y - pnt.y, 2) + pow(this.z - pnt.z, 2));
    }

    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }
    public void info2() {
        System.out.println(String.format("Point[%s, %s, %s]", this.x, this.y, this.z));
    }
}