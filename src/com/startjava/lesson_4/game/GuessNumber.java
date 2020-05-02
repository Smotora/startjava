package com.startjava.lesson_4.game;

import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {
    Scanner scan = new Scanner (System.in);
    private Player playerOne;
    private Player playerTwo;
    int hiddenNumber = (int) (Math.random() * 101);

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void playGame() {
        System.out.println("У Вас 10 попыток на то, чтобы угадать целое число, загаданное в диапазоне (0; 100]: ");
        System.out.println("загадано " + hiddenNumber);
            for (int i = 0; i < 10; i++) {
                if (isPlayerStep(playerOne, i)) {
                    return;
                }
                if (i == 9) {
                    System.out.println(playerOne.getName() + ", попытки кончились!");
                }
                if (isPlayerStep(playerTwo, i)) {
                    return;
                }
                if (i == 9) {
                    System.out.println(playerTwo.getName() + ", попытки кончились!");
                }
            }
        playerOne.playNew(playerOne.getCount());
        playerTwo.playNew(playerTwo.getCount());
    }

    private boolean isPlayerStep(Player player, int index) {
        System.out.println(player.getName() + ", Ваш ход. Введите число: ");
        player.nextNumber(scan.nextInt(), index);
        player.setCount(index + 1);
        return isCompareNumber(player, index);
    }

    private boolean isCompareNumber(Player player, int index) {
        int playerNumber = player.getTryingNumbers()[index];
        if (playerNumber != hiddenNumber) {
            if (playerNumber > hiddenNumber) {
                System.out.println("Введенное вами число больше загаданого компьютером");
            } else {
                System.out.println("Введенное вами число меньше загаданого компьютером");
            }
            return false;
        } else {
            System.out.println(player.getName() + ", Вы победили!");
            System.out.println("Загаданное число: " + hiddenNumber + ". Число попыток: " + (player.getCount()));
            attempts(playerOne, playerOne.getCount());
            attempts(playerTwo, playerTwo.getCount());
            return true;
        }
    }

    private void attempts(Player player, int index) {
        int[] numbers1 = Arrays.copyOf(player.getTryingNumbers(), index);
        System.out.print("Числа, названные игроком " + player.getName() + ": "+ "\r\n");
        for (int numbers2 : numbers1) {
            System.out.print(numbers2 + " " + "\r\n");
        }
    }
}
