package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Cherno Alpha");
        jaegerOne.setStatus("Destroyed");
        jaegerOne.setKaijuKilled(6);
        System.out.println("Модель егеря №1: " + jaegerOne.getModelName());
        System.out.println("Статус егеря №1: " + jaegerOne.getStatus());
        System.out.println("Количество убитых егерем №1 кайдзю: " + jaegerOne.getKaijuKilled());
        jaegerOne.setKaijuKilled(7);
        System.out.println("Количество убитых егерем №1 кайдзю + 1: " + jaegerOne.getKaijuKilled());
        System.out.print("Егерь №1: ");
        jaegerOne.killKaiju();
        System.out.print("Егерь №1: ");
        jaegerOne.useForce();
        System.out.print("Егерь №1: ");
        jaegerOne.useWeapon();
        System.out.println();

        Jaeger jaegerTwo = new Jaeger("Coyote Tango", "Destroyed", 2);
        System.out.println("Модель егеря №2: " + jaegerTwo.getModelName());
        System.out.println("Статус егеря №1: " + jaegerTwo.getStatus());
        System.out.println("Количество убитых егерем №2 кайдзю: " + jaegerTwo.getKaijuKilled());
        jaegerTwo.setKaijuKilled(3);
        System.out.println("Количество убитых егерем №2 кайдзю + 1: " + jaegerTwo.getKaijuKilled());
        System.out.print("Егерь №2: ");
        jaegerTwo.killKaiju();
        System.out.print("Егерь №2: ");
        jaegerTwo.useForce();
        System.out.print("Егерь №2: ");
        jaegerTwo.useWeapon();
    }
}