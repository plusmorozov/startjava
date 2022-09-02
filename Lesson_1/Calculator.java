public class Calculator {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        int result = 0;
        char mathOperation = '/';
        if (mathOperation == '+') {
            result = num1 + num2;
        } else if (mathOperation == '-') {
            result = num1 - num2;
        } else if (mathOperation == '+') {
            result = num1 - num2;
        } else if (mathOperation == '*') {
            result = num1 * num2;
        } else if (mathOperation == '/') {
            result = num1 / num2;
        } else if (mathOperation == '^') {
            result = 1;
            for (int i = 1; i <= num2; i++) {
                result *= num1;
            }
        } else if (mathOperation == '%') {
            result = num1 % num2;
        }
        System.out.println(num1 + " " + mathOperation + " " + num2 + " = " + result);
    }
}