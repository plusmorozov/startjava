package com.startjava.lesson_2_3.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();

        wolfOne.setGender("Мужской");
        wolfOne.setNickname("Новый волк №2");
        wolfOne.setWeight(45.6f);
        wolfOne.setAge(7);
        wolfOne.setColor("Белый");

        System.out.println("Пол волка = " + wolfOne.getGender());
        System.out.println("Кличка волка = " + wolfOne.getNickname());
        System.out.println("Вес волка = " + wolfOne.getWeight());
        System.out.println("Возраст волка = " + wolfOne.getAge());
        System.out.println("Окрас волка = " + wolfOne.getColor());
    }
}