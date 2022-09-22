package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        String option = "yes";
        do {
            if("yes".equals(option)) {
                game.play();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            option = scanner.nextLine();
        } while (!"no".equals(option));
    }
}