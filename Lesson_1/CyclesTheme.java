public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int i = -10;
        int sumEvenNumber = 0;
        int sumOddNumber = 0;
        do {
            if (i % 2 == 0) {
                sumEvenNumber += i;
            } else {
                sumOddNumber += i;
            }
            i++;
        } while (i <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEvenNumber 
                + ", а нечетных = " + sumOddNumber);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num2;
        if (num2 > num1) {
            max = num2;
            min = num1;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num3 < min) {
            min = num3;
        }
        for (i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int srcNum = 12341;
        System.out.println("Исходное число = " + srcNum);
        System.out.print("Реверсивное число = ");        
        int sum = 0;
        while (srcNum != 0) {
            int digit = srcNum % 10;
            System.out.print(digit);
            sum += digit;
            srcNum /= 10;
        }
        System.out.println("\nСумма цифр = " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int count = 0;
        for (i = 1; i < 24; i += 2) {
            count++;
            System.out.printf("%3d", i);
            if (count % 5 == 0) {
                System.out.println();
            }
        }
        for (i = 1; i <= 5 - count % 5; i++) {
            System.out.printf("%3d", 0);
        }

        System.out.println("\n\n5. Проверка количества единиц на четность");
        i = 1;
        srcNum = 311591;
        int copySrcNum = srcNum;
        count = 0;
        while (copySrcNum != 0) {
            if (copySrcNum % 10 == 1) {
                count++;
            }
            copySrcNum /= 10;
        }
        String stringOutFormat = "Число %7d содержит %2d %s количество единиц";
        if (count % 2 == 0) {
            System.out.printf(stringOutFormat, srcNum, count, "(четное)");
        } else {
            System.out.printf(stringOutFormat, srcNum, count, "(нечетное)");
        }

        System.out.println("\n6. Отображение фигур в консоли");

        // прямоугольник
        int j = 11;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // прямоугольный треугольник
        i = 1;
        while (i <= 5) {
            j = 5;
            while (j >= i) {
                System.out.print("#");
                j--;
            }
            System.out.println();
            i++;
        }
        System.out.println();

        // равнобедренный треугольник
        int numLines = 4;
        int countLines = 0;
        i = 0;
        do {
            if (i <= numLines / 2) {
                countLines++;
            } else {
                countLines--;
            }
            j = 0;
            do {
                System.out.print("$");
                j++;
            } while (j < countLines);
            i++;
            System.out.println();
        } while (i <= numLines);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%4s%8s%n", "DEC", "CHAR");
        for (char symbol = '\0'; symbol <= '/'; symbol++) {
            if (symbol % 2 != 0) {
                System.out.printf("%3d%8c%n", (int) symbol, symbol);
            }
        }
        for (char symbol = 'a'; symbol <= 'z'; symbol++) {
            if (symbol % 2 == 0) {
                System.out.printf("%3d%8c", (int) symbol, symbol);
                System.out.println();
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        srcNum = 1234321;
        copySrcNum = srcNum;
        int reverseNum = 0;
        while (copySrcNum != 0) {
            reverseNum = reverseNum * 10 + (copySrcNum % 10);
            copySrcNum /= 10;
        }
        if (srcNum == reverseNum) {
            System.out.println("Число " + srcNum + " является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        srcNum = 179854;
        int sumLeft = 0;
        int sumRight = 0;
        int numLeft = srcNum / 1000;
        int numRight = srcNum % 1000;
        while (numLeft != 0) {
            sumLeft += numLeft % 10;
            numLeft /= 10;
            sumRight += numRight % 10;
            numRight /= 10; 
        }
        stringOutFormat = "Сумма цифр %d = %d%n";
        System.out.printf(stringOutFormat, srcNum / 1000, sumLeft);
        System.out.printf(stringOutFormat, srcNum % 1000, sumRight);
        stringOutFormat = "Число %d является %s%n";
         if (sumLeft == sumRight) {
            System.out.printf(stringOutFormat, srcNum, "счастливым");
        } else {
            System.out.printf(stringOutFormat, srcNum, "несчастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        for (i = 2; i <= 9; i++) {
            if (i == 2) {
                System.out.print(" | ");
                for (j = 2; j <= 9; j++) {
                    System.out.printf("%3d", j);
                }
                System.out.println();
                for (j = 2; j <= 28; j++) {
                    System.out.print("-");
                }
                System.out.println();
            }
            System.out.print(i + "| ");
            for (j =2; j <= 9; j++) {
                System.out.printf("%3d", i*j);
            }
            System.out.println();
        }
    }
}