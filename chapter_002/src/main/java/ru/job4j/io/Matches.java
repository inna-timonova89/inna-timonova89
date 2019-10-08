package ru.job4j.io;

import java.util.Scanner;
/**
 * @version $Id$
 * @since 0.1
 */
public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        int select = 0;
        while (matches > 0) {
            System.out.println("Выберите спички в количестве от 1 до 3 штук.");
            boolean run = false;
            while (!run) {
                select = Integer.valueOf(input.nextLine());
                if (select >= 1 && select <= 3) {
                    run = true;
                } else {
                    System.out.println("Такой ход сделать невозможно. Попробуйте еще раз.");
                }
            }
            matches -= select;
            System.out.println("Спичек осталось " + matches + " штук");
            if (matches == 0) {
                System.out.println("Игра закончена, спичек больше нет. Поздравляем с победой!");
            } else if (select > matches) {
                System.out.println("Увы! такое количество спичек недоступно. Попробуйте еще раз.");
            }
        }
    }
}