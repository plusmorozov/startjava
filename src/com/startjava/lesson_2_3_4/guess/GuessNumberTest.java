package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        String playerAnswer;
        Scanner scanner = new Scanner(System.in);
        System.out.println("У каждого игрока по " + Player.CNT_ATTEMPTS + " попыток ");
        System.out.print("Введите имя первого игрока: ");
        Player playerOne = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player playerTwo = new Player(scanner.nextLine());
        GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
        do {
            guessNumber.play();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                playerAnswer = scanner.nextLine();
            } while (!playerAnswer.equals("yes") && !playerAnswer.equals("no"));
        } while (playerAnswer.equals("yes"));
    }
}