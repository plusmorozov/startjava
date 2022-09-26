package com.startjava.lesson_2_3_4.calculator;

import java.util.InputMismatchException;

public class Calculator {

    public static int calculate(String partsExpression ) {
        String[] arrMathExpression = partsExpression .split(" ");
        int num1 = Integer.parseInt(arrMathExpression[0]);
        int num2 = Integer.parseInt(arrMathExpression[2]);
        char mathOperation = arrMathExpression[1].charAt(0);
        if((num1 < 1) || (num2 < 1)) {
            throw new InputMismatchException();
        }
        return switch (mathOperation) {
            case '+' -> Math.addExact(num1, num2);
            case '-' -> Math.subtractExact(num1, num2);
            case '*' -> Math.multiplyExact(num1, num2);
            case '/' -> Math.floorDiv(num1, num2);
            case '^' -> (int) Math.pow(num1, num2);
            case '%' -> Math.floorMod(num1, num2);
            default -> throw new IllegalStateException();
        };
    }
}