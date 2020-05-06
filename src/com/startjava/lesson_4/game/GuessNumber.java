package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner (System.in);
    private Player playerOne;
    private Player playerTwo;
    private int hiddenNumber = (int) (Math.random() * 101);

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void playGame() {
        System.out.println("У Вас 10 попыток на то, чтобы угадать целое число, загаданное в диапазоне (0; 100]: ");
        System.out.println("загадано " + hiddenNumber);
        for (int i = 0; i < 10; i++) {
            if (makeMove(playerOne, i)) {
                return;
            }
            if (i == 9) {
                System.out.println(playerOne.getName() + ", попытки кончились!");
                showEnteredNumbers(playerOne, playerOne.getAttempt());
            }
            if (makeMove(playerTwo, i)) {
                return;
            }
            if (i == 9) {
                System.out.println(playerTwo.getName() + ", попытки кончились!");
                showEnteredNumbers(playerTwo, playerTwo.getAttempt());
            }
        }
        playerOne.clear(playerOne.getAttempt());
        playerTwo.clear(playerTwo.getAttempt());
    }

    private void enterNumber(Player player, int index) {
        System.out.println(player.getName() + ", Ваш ход. Введите число: ");
        player.setNumber(scan.nextInt(), index);
    }

    private boolean makeMove(Player player, int index) {
        enterNumber(player, index);
        player.setAttempt(index + 1);
        return compareNumber(player, index);
    }

    private boolean compareNumber(Player player, int index) {
        int num = player.getNumbers();
        if (num != hiddenNumber) {
            if (num > hiddenNumber) {
                System.out.println("Введенное вами число больше загаданого компьютером");
            } else {
                System.out.println("Введенное вами число меньше загаданого компьютером");
            }
            return false;
        } else {
            System.out.println(player.getName() + ", Вы победили!");
            System.out.println("Загаданное число: " + hiddenNumber + ". Число попыток: " + (player.getAttempt()));
            return true;
        }
    }

    private void showEnteredNumbers(Player player, int index) {
        System.out.print("Числа, названные игроком " + player.getName() + ": "+ "\r\n");
        for (int number : player.getEnteredNumbers()) {
            System.out.print(number + " " + "\r\n");
        }
    }
}
