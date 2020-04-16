package com.startjava.lesson_2_3.game;

import java.util.Scanner;

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
		System.out.println("Попробуйте угадать целое число, загаданное в диапазоне (0; 100]: ");
		while(true) {
			System.out.println(playerOne.getName() + ", Ваш ход. Введите число: ");
			playerOne.setNumber(scan.nextInt());
			if (playerOne.getNumber() > hiddenNumber) {
				System.out.println("Ввёденное Вами число больше того, что загадано.");
			} else if (playerOne.getNumber() < hiddenNumber) {
				System.out.println("Ввёденное Вами число меньше того, что загадано.");
			} else if (playerOne.getNumber() == hiddenNumber) {
				System.out.println(playerOne.getName() + " победил! Загаданное число: " + hiddenNumber);
				break;
			}
			System.out.println(playerTwo.getName() + ", Ваш ход. Введите число: ");
			playerTwo.setNumber(scan.nextInt());
			if (playerTwo.getNumber() > hiddenNumber) {
				System.out.println("Ввёденное Вами число больше того, что загадано.");
			} else if (playerTwo.getNumber() < hiddenNumber) {
				System.out.println("Ввёденное Вами число меньше того, что загадано.");
			} else if (playerTwo.getNumber() == hiddenNumber) {
				System.out.println(playerTwo.getName() + " победил! Загаданное число: " + hiddenNumber);
				break;
			}
		}
	}
}