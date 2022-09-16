package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] numbers = {3, 5, 2, 1, 7, 4, 6};
        int length = numbers.length;
        System.out.println("Исходный массив:");
        printArray(numbers);
        for(int i = 0; i <= length / 2; i++) {
            int tmp = numbers[i];
            length--;
            numbers[i] = numbers[length];
            numbers[length] = tmp;
        }
        System.out.println("Массив после модификации:");
        printArray(numbers);

        System.out.println("\n2. Вывод произведения элементов массива");
        numbers = new int[10];
        length = numbers.length;
        for(int i = 0; i < length; i++) {
            numbers[i] = i;
        }
        int multNumbers = 1;
        for(int i = 1; i < length - 1; i++) {
            multNumbers *= numbers[i];
            System.out.print(i + (i == length - 2 ? " = " + multNumbers : " * "));
        }

        System.out.println("\n\n3. Удаление элементов массива");
        double[] numbers3 = new double[15];
        length = numbers3.length;
        for(int i = 0; i < length; i++) {
            numbers3[i] = Math.random();
        }
        System.out.println("Исходный массив:");
        printArray(numbers3, 7);
        int countZeroCell = 0;
        double valueMiddleCell = numbers3[length / 2];
        System.out.println(valueMiddleCell);
        for(int i = 0; i < length; i++) {
            if(numbers3[i] > valueMiddleCell) {
                numbers3[i] = 0;
                countZeroCell++;
            }
        }
        System.out.println("Измененный массив:");
        printArray(numbers3, 7);
        System.out.println("Количество обнуленных ячеек: " + countZeroCell);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] arrEngLetters = new char[26];
        length = arrEngLetters.length;
        for(int i = 0; i < length; i++) {
            arrEngLetters[i] = (char) (i + 65);
        }
        for(int i = 0; i < length; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(arrEngLetters[length - 1 - j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        int[] numbers4 = new int[30];
        length = numbers4.length;
        for(int i = 0; i < length; i++) {
            boolean unique = false;
            do {
                for(int j = 0; j < i; j++) {
                    if (numbers4[i] == numbers4[j]) {
                        numbers4[i] = 60 + (int) (Math.random() * 40);
                        unique = true;
                        break;
                    }
                    unique = false;
                }
            } while (unique);
        }
        // сортировка массива
        for(int i = numbers4.length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(numbers4[j] > numbers4[j + 1]) {
                    int tmp = numbers4[j];
                    numbers4[j] = numbers4[j + 1];
                    numbers4[j + 1] = tmp;
                }
            }
        }
        printArray(numbers4, 10);

        System.out.println("\n6. Сдвиг элементов массива");
        String[] srcArrString = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        length = srcArrString.length;
        int cntNonBlank = 0;
        // вычисление количества непустых элементов массива
        for(String string : srcArrString) {
            if(!string.isBlank()) {
                cntNonBlank++;
            }
        }
        String[] destArrString = new String[cntNonBlank];
        int insertPosition = 0;
        int i = 0;
        while(i < length) {
            cntNonBlank = 1;
            if(!srcArrString[i].isBlank()) {
                int j = i + 1;
                while(!srcArrString[j].isBlank()) {
                    cntNonBlank++;
                    j++;
                }
                System.arraycopy(srcArrString, i, destArrString, insertPosition, cntNonBlank);
                insertPosition += cntNonBlank;
            }
            i += cntNonBlank;
        }
        printArray(srcArrString);
        printArray(destArrString);
    }

    private static void printArray(int[] numbers) {
        for(int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static void printArray(double[] numbers) {
        for(double number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static void printArray(double[] numbers, int numReturnNewLine) {
        for(int i = 0; i < numbers.length; i++) {
            System.out.printf("%.3f" + " ", numbers[i]);
            if(i == numReturnNewLine) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static void printArray(int[] numbers, int numReturnNewLine) {
        for(int i = 0; i < numbers.length; i++) {
            if((i % numReturnNewLine != 0) && (i != 0)) {
                System.out.print(numbers[i] + " " );
            } else {
                System.out.println();
            }
        }
    }

    private static void printArray(String[] arrString) {
        for(String string : arrString) {
            System.out.print(string + " ");
        }
        System.out.println();
    }
}
