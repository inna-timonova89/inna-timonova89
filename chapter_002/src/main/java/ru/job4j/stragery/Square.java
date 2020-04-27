package ru.job4j.stragery;

/**
 * @author inna.timonova (ms.timonovai@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Square implements Shape {
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("+++++++");
        pic.append(System.lineSeparator());
        pic.append(""
                +
                "+++++++");
        pic.append(System.lineSeparator());
        pic.append("+++++++");
        pic.append(System.lineSeparator());
        pic.append("+++++++");
        return pic.toString();
    }
}

