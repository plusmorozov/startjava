package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] numbers = {3, 5, 2, 1, 7, 4, 6};

        for(int i = 0; i < numbers.length / 2; i++)
        {
            int tmp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = tmp;
        }

        for(int number : numbers) {
            System.out.print(number + " ");
        }

//        переставьте значения в исходном массиве в обратном порядке
//        при этом берите значения для перезаписи из самого массива
//        не используйте сортировку
//        отобразите значения массива в две строки до модификации и после, отделяя числа друг от друга пробелом
    }

    private void printArray() {

    }


}
