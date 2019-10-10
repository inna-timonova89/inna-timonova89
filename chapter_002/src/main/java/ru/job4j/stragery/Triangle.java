package ru.job4j.stragery;

/**
 * @author inna.timonova (ms.timonovai@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Triangle implements Shape {
    @Override
    public String draw() {
        StringBuilder pict = new StringBuilder();
        pict.append("   +  ");
        pict.append(System.lineSeparator());
        pict.append("  +++ ");
        pict.append(System.lineSeparator());
        pict.append(" +++++");
        pict.append(System.lineSeparator());
        pict.append("+++++++");
        return pict.toString();
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.draw();
    }
}
