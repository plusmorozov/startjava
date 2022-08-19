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
        for (i = max-1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        System.out.println("Исходное число = " + srcNum);
        System.out.print("Реверсивное число = ");
        num1 = srcNum;
        i = 1;
        int sum = 0;
        while (i <= 4) {
            System.out.print(num1 % 10);
            sum += num1 % 10;
            num1 /= 10;
            i++;
        }
        
        System.out.println("\nСумма цифр = " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int j = 0;
        for(i = 1; i < 24; i = i) {
            for(j = 1; j <= 5 && i < 24; i += 2) {
                System.out.printf("%3d", i);
                j++;
            }
            if (6 - j != 0) {
                for (int k = 1; k <= (6 - j); k++) {
                    System.out.printf("%3d", 0);
                }
            }
            System.out.println();
        }

        System.out.println("\n5. Проверка количества единиц на четность");
        i = 1;
        srcNum = 3141591;
        num1 = srcNum;
        int count = 0;
        while (i <= 7) {
            if (num1 % 10 == 1) {
                count++;
            }
            num1 /= 10;
            i++;
        }
        if (count % 2 == 0) {
            System.out.print("Число " + srcNum + " содержит " + count 
                + " (четное) количество единиц");
        } else {
            System.out.print("Число " + srcNum + " содержит " + count 
                + " (нечетное) количество единиц");
        }
        
        System.out.println("\n6. Отображение фигур в консоли");
        // прямоугольник
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("");
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
        i = 1;
        do {
            j = 1;
            while (j <= i) {
                System.out.print("$");
                j++;
            }
            System.out.println();
            i++;
        } while (i <= 3);
        i = 1;
        do {
            j = 2;
            while (j >= i) {
                System.out.print("$");
                j--;
            }
            System.out.println();
            i++;
        } while (i <= 2);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("DEC     CHAR");
        for (char symbol = '\0'; symbol <= '/'; symbol++) {
            if (symbol % 2 != 0) {
                System.out.printf("%3d      %3c", (int)symbol, symbol);
                System.out.println();
            }
        }
        for (char symbol = 'a'; symbol <= 'z'; symbol++) {
            if (symbol % 2 == 0) {
                System.out.printf("%3d      %3c", (int)symbol, symbol);
                System.out.println();
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int srcNum1 = 1234321;
        num1 = srcNum1;
        int mirrorNum1 = 0;
        while (num1 != 0) {
            mirrorNum1 = mirrorNum1 * 10 + (num1 % 10);
            num1 /= 10;
        }
        if (srcNum1 == mirrorNum1) {
            System.out.println("Число " + srcNum1 + " является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        srcNum1 = 179854;
        num1 = srcNum1;
        int sumLeft = 0;
        int sumRight = 0;
        for (i = 1; i <= 6; i++) {
            if (i <= 3) {
                sumRight += num1 % 10;
                num1 /= 10;
            }
            if (i > 3) {
                sumLeft += num1 % 10;
                num1 /= 10;
            }
        }
        System.out.println("Сумма цифр " + srcNum1 / 1000 + " = " + sumLeft);
        System.out.println("Сумма цифр " + srcNum1 % 1000 + " = " + sumRight);
        if (sumLeft == sumRight) {
            System.out.println("Число " + srcNum1 + " является счастливым");
        } else {
            System.out.println("Число " + srcNum1 + " является несчастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        for (i = 2; i <= 9; i++) {
            if (i == 2) {
                System.out.print(" | ");
                for (j = 2; j <= 9; j++) {
                    System.out.printf("%2d ", j);
                }
                System.out.println();
                for (j = 2; j <= 27; j++) {
                    System.out.print("-");
                }
                System.out.println();
                
            }
            System.out.print(i + "| ");
            for (j =2; j <= 9; j++) {
                System.out.printf("%2d ", i*j);
            }
            System.out.println();
        }
    }
}