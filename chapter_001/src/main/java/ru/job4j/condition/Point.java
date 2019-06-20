package ru.job4j.condition;

/**
 * Point
 *
 *@author inna.timonova (ms.timonovai@mail.ru)
 */

public class Point {
    /**
     *distance.
     *@param x1 the first point in the X coordinates.
     *@param y1 the first point in the Y coordinates.
     *@param x2 the second  point in the X coordinates.
     *@param y2 the second point in the Y coordinates.
     *@return the distance between 2 points in the coordinates system.
     */
    public double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow(x2 - x1, 2);
        double second = Math.pow(y2 - y1, 2);
        double third = first + second;
        return Math.sqrt(third);
    }
}