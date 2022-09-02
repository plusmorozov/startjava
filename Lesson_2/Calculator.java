public class Calculator {
    private int num1;
    private int num2;
    private int result;
    private char mathOperation;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public char getMathOperation() {
        return mathOperation;
    }

   public int calculation (int num1, int num2, char mathOperation) {
        switch (mathOperation) {
            case '+':
                result = addition(num1, num2);
                break;
            case '-':
                result = subtraction(num1, num2);
                break;
            case '*':
                result = multiplication(num1,num2);
                break;
            case '/':
                result = division(num1, num2);
                break;
            case '^':
                result = exponentiation(num1, num2);
                break;
            case '%':
                result = remainderDivision(num1, num2);
                break;
        }
        return result;
    }

    private int addition(int num1, int num2) {
        return num1 + num2;
    }

    private int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    private int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    private int division(int num1, int num2) {
        return num1 / num2;
    }

    private int exponentiation(int num1, int num2) {
        result = 1;
            for (int i = 1; i <= num2; i++) {
                result *= num1;
            }
        return result;
    }

    private int remainderDivision(int num1, int num2) {
        return num1 % num2;
    }
}
