package com.startjava.lesson_2_3_4.calculator;

import java.util.Arrays;
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String userAnswer;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введите выражение, которое требуется вычислить: ");
            String[] mathExpression = scanner.nextLine().split(" ");
            System.out.println("Результат: " + Calculator.calculate(mathExpression));
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                userAnswer = scanner.nextLine();
            } while (!userAnswer.equals("yes") && !userAnswer.equals("no"));
        } while (userAnswer.equals("yes"));
         scanner.close();
    }
}
