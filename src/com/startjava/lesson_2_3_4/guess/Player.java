package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    public static final int CNT_ATTEMPTS = 10;
    private String name;
    private int attempt;
    private int[] nums = new int[CNT_ATTEMPTS];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNum(int num, int i) {
        this.nums[i] = num;
    }

    public int getNum(int i) {
        return nums[i];
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, attempt);
    }

    public void resetNums() {
        Arrays.fill(nums, 0, attempt, 0);
    }

    public void addAttempt() {
        attempt++;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public int getAttempt() {
        return attempt;
    }
}