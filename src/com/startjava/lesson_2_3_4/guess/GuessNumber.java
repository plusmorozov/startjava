package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    public static final int CNT_ATTEMPTS = 2;
    private Player player1;
    private Player player2;
    private int secretNum;
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        System.out.println("У каждого игрока по " + CNT_ATTEMPTS + " попыток ");
        init();
        System.out.println("Загаданное число: " + secretNum);
        int i = 0;
        do {
            inputNum(player1, i);
            if (checkNum(player1, i)) {
                break;
            }
            inputNum(player2, i);
            i++;
        } while (!checkNum(player2, i - 1) && i < CNT_ATTEMPTS);
        printPlayerNumber(player1);
        printPlayerNumber(player2);
    }

    private void inputNum(Player player, int i) {
        System.out.print("Игрок " + player.getName() + " введите число: ");
        player.addNum(scanner.nextInt(), i);
    }

    private boolean checkNum(Player player, int i) {
        int num = player.getNum(i);
        String name = player.getName();
        if (num == secretNum) {
            System.out.println("Игрок " + name + " угадал число " + secretNum + " c попытки № "
                    + (player.getAttempt()));
            return true;
        }
        if (num > secretNum) {
            System.out.println(name + ", введенное число больше загаданного");
        } else if (num < secretNum) {
            System.out.println(name + ", введенное число меньше загаданного");
        }
        if(player.getAttempt() == CNT_ATTEMPTS) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
        }
        return false;
    }

    private void printPlayerNumber(Player player) {
        System.out.print("Числа введенные игроком " + player.getName() + ": ");
        for(int num : player.getNums()) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private void init() {
        player1.setAttempt(0);
        player2.setAttempt(0);
        player1.resetNums();
        player2.resetNums();
        secretNum = (int) ((Math.random() * 100) + 1);
    }
}