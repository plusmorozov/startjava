package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private Player playerOne;
    private Player playerTwo;
    private int secretNum;
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void play() {
        playerOne.setAttempt(0);
        playerTwo.setAttempt(0);
        playerOne.resetNums();
        playerTwo.resetNums();
        secretNum = (int) ((Math.random() * 100) + 1);
        System.out.println("Загаданное число: " + secretNum);
        int i = 0;
        do {
            inputNum(playerOne, i);
            if (checkNum(playerOne, i)) {
                break;
            }
            inputNum(playerTwo, i);
            i++;
        } while (!checkNum(playerTwo, i - 1) & i < Player.CNT_ATTEMPTS);
        outPlayerNumber(playerOne);
        outPlayerNumber(playerTwo);
    }

    private void inputNum(Player player, int i) {
        System.out.print("Игрок " + player.getName() + " введите число: ");
        player.setNum(scanner.nextInt(), i);
        player.addAttempt();
        if(player.getAttempt() == Player.CNT_ATTEMPTS) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
        }
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
        return false;
    }

    private void outPlayerNumber(Player player) {
        System.out.print("Числа введенные игроком " + player.getName() + ": ");
        for(int num : player.getNums()) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


