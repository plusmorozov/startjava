package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int attempt;
    private int[] nums = new int[GuessNumber.CNT_ATTEMPTS];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addNum(int num) {
        nums[attempt] = num;
        attempt++;
    }

    public int getNum(int attempt) {
        return nums[attempt];
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, attempt);
    }

    public void resetNums() {
        Arrays.fill(nums, 0, attempt, 0);
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public int getAttempt() {
        return attempt;
    }
}