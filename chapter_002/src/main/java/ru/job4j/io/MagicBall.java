package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        System.out.print("Я великий оракул. Что ты хочешь узнать?");
        Scanner input = new Scanner(System.in);
        String question = input.nextLine();
        int answer = new Random().nextInt(3);

        if (answer == 0) {
            System.out.println("да");
        } else if (answer == 1) {
            System.out.println("нет");
        } else {
            System.out.println("может быть");
        }
    }
}
