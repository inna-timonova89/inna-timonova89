package ru.job4j.io;

import java.util.Scanner;

/**
 * @version $Id$
 * @since 0.1
 */
public class Dendy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Игры.");
            System.out.println("1. Танчики");
            System.out.println("2. Супер Марио");
            System.out.println("3. Выйти");
            System.out.println("Выберите пункт меню, чтобы наать игру: ");
            int select = Integer.valueOf(input.nextLine());
            if (select == 3) {
                System.out.println("Игра завершена.");
            } else if (select == 1) {
                System.out.println("Танчики загружаются ... ");
            } else if (select == 2) {
                System.out.println("Супер марио загружается ... ");
            } else {
                System.out.println("Такой игр нет.");
            }
            System.out.println();
        }
    }
}
