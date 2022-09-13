package com.startjava.lesson_2_3_4.robot;

public class Jaeger {

    private String modelName;
    private String status;
    private int kaijuKilled;

    public Jaeger() {
    }

    public Jaeger(String modelName, String status, int kaijuKilled) {
        this.modelName = modelName;
        this.status = status;
        this.kaijuKilled = kaijuKilled;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setKaijuKilled(int kaijuKilled) {
        this.kaijuKilled = kaijuKilled;
    }

    public int getKaijuKilled() {
        return kaijuKilled;
    }

    public void killKaiju() {
        System.out.println("Вызван метод killKaiju");
    }

    public void useForce() {
        System.out.println("Вызван метод useForce");
    }

    public void useWeapon() {
        System.out.println("Вызван метод useWeapon");
    }
}