package com.startjava.lesson_1.base;

public class MyFirstGame {
    public static void main(String[] args) {
        int secretNum = 43;
        int enteredNum = 15;
        do {
            if (secretNum > enteredNum) {
                System.out.println("Число " + enteredNum + " меньше того, что загадал компьютер");
                enteredNum += secretNum / 2 + 5;
            } else if (secretNum < enteredNum) {
                System.out.println("Число " + enteredNum + " больше того, что загадал компьютер");
                enteredNum -= secretNum / 2 - 5;
            }
        } while (secretNum != enteredNum);
        System.out.println("Вы победили!");
    }
}