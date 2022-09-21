package com.startjava.lesson_2_3_4.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String userAnswer = "yes";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введите выражение, которое требуется вычислить: ");
            try {
                System.out.println("Результат: " + Calculator.calculate(scanner.nextLine()));
            } catch(NumberFormatException | InputMismatchException | IllegalStateException e) {
                System.out.println("Введены некорректные данные!");
                continue;
            }
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                userAnswer = scanner.nextLine();
            } while (!userAnswer.equals("yes") && !userAnswer.equals("no"));
        } while (userAnswer.equals("yes"));
        scanner.close();
    }
}