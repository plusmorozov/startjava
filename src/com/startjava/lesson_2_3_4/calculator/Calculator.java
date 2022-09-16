package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int num1;
    private int num2;
    private int result;
    private char mathOperation;

    private void setNum1(int num1) {
        this.num1 = num1;
    }

    private void setNum2(int num2) {
        this.num2 = num2;
    }

    private void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public int calculate(String[] mathExpression) {
        setNum1(Integer.parseInt(mathExpression[0]));
        char[] charArray = mathExpression[1].toCharArray();
        setMathOperation(charArray[0]);
        setNum2(Integer.parseInt(mathExpression[2]));

        switch (mathOperation) {
            case '+':
                return Math.addExact(num1, num2);
            case '-':
                return Math.subtractExact(num1, num2);
            case '*':
                return Math.multiplyExact(num1, num2);
            case '/':
                return Math.floorDiv(num1, num2);
            case '^':
                return (int) Math.pow(num1, num2);
            case '%':
                return Math.floorMod(num1, num2);
        }
        return result;
    }
}
