package ru.job4j.loop;
/**
 * Возвращает шахматную доску из символов x и пробелов.
 * @return Результат сложения строк из сиволово и пробелов и перенос этих строк.
 * @author inna.timonova (ms.timonovai@mail.ru)
 */
public class Board {
        public String paint(int width, int height) {
            StringBuilder screen = new StringBuilder();
            String ln = System.lineSeparator();
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if ((i + j) % 2 == 0) {
                        screen.append("X");
                    } else {
                        screen.append(" ");
                    }
                }
                screen.append(ln);
            }
            return screen.toString();
        }
    }