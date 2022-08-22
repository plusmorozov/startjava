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
        int copySrcNum = srcNum;
        System.out.println("Исходное число = " + srcNum);
        System.out.print("Реверсивное число = ");        
        int sum = 0;
        while (copySrcNum != 0) {
            int partNum = copySrcNum % 10;
            System.out.print(partNum);
            sum += partNum;
            copySrcNum /= 10;
        }
        System.out.println("\nСумма цифр = " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int count = 0;
        for (i = 1; i < 24; i += 2) {
            count++;
            if (count % 5 != 0) {
                System.out.printf("%3d", i);
            } else {
                System.out.printf("%3d", i);
                System.out.println();
            }
        }
        for (i = 1; i <= 5 - count % 5; i++) {
            System.out.printf("%3d", 0);
        }

        System.out.println("\n\n5. Проверка количества единиц на четность");
        i = 1;
        srcNum = 3141591;
        copySrcNum = srcNum;
        count = 0;
        while (i <= 7) {
            if (copySrcNum % 10 == 1) {
                count++;
            }
            copySrcNum /= 10;
            i++;
        }
        if (count % 2 == 0) {
            System.out.println("Число " + srcNum + " содержит " + count 
                    + " (четное) количество единиц");
        } else {
            System.out.println("Число " + srcNum + " содержит " + count 
                    + " (нечетное) количество единиц");
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
        i = 0;
        do {
            for (j = 0; j < i + 1; j++) {
                System.out.print("$");
            }
            System.out.println();
            i++;
        } while (i < 3);
        i = 2;
        do {
            for (j = 0; j < i; ++j) {
                System.out.print("$");
            }
            System.out.println();
            i--;
        } while (i > 0);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%4s%8s%n", "DEC", "CHAR");
        for (char symbol = '\0'; symbol <= '/'; symbol++) {
            if (symbol % 2 != 0) {
                System.out.printf("%3d%8c", (int) symbol, symbol);
                System.out.println();
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
        num1 = srcNum;
        int sumLeft = 0;
        int sumRight = 0;
        for (i = 1; num1 != 0; i++) {
            if (i <= ((Math.log10(srcNum)+1)/2)) {
                sumRight += num1 % 10;
                num1 /= 10;
            }
            if (i > ((Math.log10(srcNum)+1)/2)) {
                sumLeft += num1 % 10;
                num1 /= 10;
            }
        }
        System.out.println("Сумма цифр " + srcNum / 1000 + " = " + sumLeft);
        System.out.println("Сумма цифр " + srcNum % 1000 + " = " + sumRight);
        if (sumLeft == sumRight) {
            System.out.println("Число " + srcNum + " является счастливым");
        } else {
            System.out.println("Число " + srcNum + " является несчастливым");
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