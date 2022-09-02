import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        int num1;
        int num2;
        int result;
        char mathOperation;
        String userAnswer;

        Calculator calculator = new Calculator ();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введите первое число: ");
            calculator.setNum1(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Введите знак математической операции: ");
            calculator.setMathOperation(scanner.nextLine().charAt(0));
            System.out.print("Введите второе число: "); 
            calculator.setNum2(scanner.nextInt());
            System.out.println("Результат: " 
                    + calculator.calculation(calculator.getNum1(), calculator.getNum2(),
                      calculator.getMathOperation()));
            scanner.nextLine();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                userAnswer = scanner.nextLine();
            } while (!userAnswer.equals("yes") && !userAnswer.equals("no"));
         } while (userAnswer.equals("yes"));
         scanner.close();
    }
}
