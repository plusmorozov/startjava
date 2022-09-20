package com.startjava.lesson_2_3_4.calculator;

import java.util.InputMismatchException;

public class Calculator {

    public static int calculate(String mathExpression) throws InputMismatchException, IllegalStateException {
        String[] arrMathExpression = mathExpression.split(" ");
        int num1 = Integer.parseInt(arrMathExpression[0]);
        int num2 = Integer.parseInt(arrMathExpression[2]);
        char mathOperation = arrMathExpression[1].charAt(0);
            if((num1 < 0) || (num2 < 0)) {
                throw new InputMismatchException("Числа должны быть положительными!");
            }
            return switch (mathOperation) {
            case '+' -> Math.addExact(num1, num2);
            case '-' -> Math.subtractExact(num1, num2);
            case '*' -> Math.multiplyExact(num1, num2);
            case '/' -> Math.floorDiv(num1, num2);
            case '^' -> (int) Math.pow(num1, num2);
            case '%' -> Math.floorMod(num1, num2);
            default -> throw new IllegalStateException("Неожиданное значение: " + mathOperation);
        };
    }
}





/*
package com.startjava.lesson_2_3_4.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static int calculate(String[] mathExpression) {
        int num1 = 0;
        int num2 = 0;

//        num1 = checkNum(mathExpression[0]);

        try {
            num1 = Integer.parseInt(mathExpression[0]);
            num2 = Integer.parseInt(mathExpression[2]);
        }
        catch(NumberFormatException e) {
            System.out.print("Введены дробные числа, введите целые: ");
            Scanner scanner = new Scanner(System.in);
            mathExpression = scanner.nextLine().split(" ");
            num1 = Integer.parseInt(mathExpression[0]);
            num2 = Integer.parseInt(mathExpression[2]);
        };
        char[] charArray = mathExpression[1].toCharArray();
        char mathOperation = charArray[0];

//        try {
//            if((num1 < 0) || (num2 < 0)) {
//                throw new InputMismatchException("!!!");
//            }
//        } catch(InputMismatchException e) {
//            System.out.println(e.getMessage());
//        };

        int result = switch (mathOperation) {
            case '+' -> Math.addExact(num1, num2);
            case '-' -> Math.subtractExact(num1, num2);
            case '*' -> Math.multiplyExact(num1, num2);
            case '/' -> Math.floorDiv(num1, num2);
            case '^' -> (int) Math.pow(num1, num2);
            case '%' -> Math.floorMod(num1, num2);
            default -> throw new IllegalStateException("Неожиданное значение: " + mathOperation);
        };
        return result;
    }

//    private static int checkNum(String srcString) {
//        int number = 0;
//        try {
//            number = Integer.parseInt(srcString);
//        } catch(NumberFormatException e) {
//            System.out.print("Введены дробные числа, введите целые: ");
//            Scanner scanner = new Scanner(System.in);
//            number = scanner.nextInt();
//        };
//        return number;
//    }
}
*/
