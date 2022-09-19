package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static int calculate(String[] mathExpression) {
        int num1 = Integer.parseInt(mathExpression[0]);
        int num2 = Integer.parseInt(mathExpression[2]);
        char[] charArray = mathExpression[1].toCharArray();
        char mathOperation = charArray[0];

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
}
