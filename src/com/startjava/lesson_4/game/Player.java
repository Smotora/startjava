package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
    private int number;
    private String name;
    private int[] tryingNumbers = new int[10];
    private int count;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int[] getTryingNumbers() {
        return tryingNumbers;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void nextNumber (int number, int index) {
        tryingNumbers[index] = number;
    }

    public void playNew(int index) {
        Arrays.fill(tryingNumbers, 0, index, 0);
    }
}
