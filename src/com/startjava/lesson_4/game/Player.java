package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
    private int number;
    private String name;
    private int[] enteredNumbers = new int[10];
    private int attempt;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getTryingNumbers() {
        return enteredNumbers;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public void setNumber(int number, int index) {
        enteredNumbers[index] = number;
    }

    public void clear(int index) {
        Arrays.fill(enteredNumbers, 0, index, 0);
    }
}
