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
        /*The first value raised to a 2nd power*/
        double first = Math.pow(x2 - x1, 2);
        /*The first value raised to a 2nd power*/
        double second = Math.pow(y2 - y1, 2);
        /*The sum of 2 values*/
        double third = first + second;
        /*The square root of value third*/
        return Math.sqrt(third);
    }
}