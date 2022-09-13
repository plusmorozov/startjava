package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String userAnswer;

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введите первое число: ");
            calculator.setNum1(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Введите знак математической операции: ");
            calculator.setMathOperation(scanner.nextLine().charAt(0));
            System.out.print("Введите второе число: "); 
            calculator.setNum2(scanner.nextInt());
            System.out.println("Результат: " + calculator.calculate());
            scanner.nextLine();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                userAnswer = scanner.nextLine();
            } while (!userAnswer.equals("yes") && !userAnswer.equals("no"));
         } while (userAnswer.equals("yes"));
         scanner.close();
    }
}
