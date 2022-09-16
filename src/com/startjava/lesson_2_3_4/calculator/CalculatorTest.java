package com.startjava.lesson_2_3_4.calculator;

import java.util.Arrays;
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String userAnswer;

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введите выражение, которое требуется вычислить: ");
            String[] mathExpression = scanner.nextLine().split(" ");
            calculator.setNum1(Integer.parseInt(mathExpression[0]));
            char[] charArray = mathExpression[1].toCharArray();
            calculator.setMathOperation(charArray[0]);
            calculator.setNum2(Integer.parseInt(mathExpression[2]));
            System.out.println("Результат: " + calculator.calculate());
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                userAnswer = scanner.nextLine();
            } while (!userAnswer.equals("yes") && !userAnswer.equals("no"));
         } while (userAnswer.equals("yes"));
         scanner.close();
    }
}
