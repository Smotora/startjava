import java.util.Scanner;

public class GuessNumber {
	public void newGame() {
		Player playerOne = new Player();
		Player playerTwo = new Player();
		int hiddenNumber = 0;
		String playerOneName = null;
		String playerTwoName = null;
		Scanner scan = new Scanner (System.in);
		int playerOneNumber = 0;
		int playerTwoNumber = 0;
		String againGame = null;

		do {
			System.out.println("Попробуйте угадать целое число, загаданное в диапазоне (0; 100]: ");
			hiddenNumber = (int) (Math.random() * 101);
			System.out.println("Введите имя первого игрока, затем имя второго игрока.");
			playerOneName = playerOne.getName();
			playerTwoName = playerTwo.getName();
			do {
				System.out.println(playerOneName + ", Ваш ход: ");
				playerOneNumber = playerOne.getPlayerNumber();
				if (playerOneNumber > hiddenNumber) {
					System.out.println("Ввёденное Вами число больше того, что загадано, ход игрока " + playerTwoName);
				} else if (playerOneNumber < hiddenNumber) {
					System.out.println("Ввёденное Вами число меньше того, что загадано, ход игрока " + playerTwoName);
				} else {
					break;
				}
				System.out.println(playerTwoName + ", Ваш ход: ");
				playerTwoNumber = playerTwo.getPlayerNumber();
				if (playerTwoNumber > hiddenNumber) {
					System.out.println("Ввёденное Вами число больше того, что загадано, ход игрока " + playerOneName);
				} else if (playerTwoNumber < hiddenNumber) {
					System.out.println("Ввёденное Вами число меньше того, что загадано, ход игрока " + playerOneName);
				} else {
					break;
				}
			} while (hiddenNumber != playerOneNumber && hiddenNumber != playerTwoNumber);
				if (playerOneNumber == hiddenNumber) {
					System.out.println(playerOneName + " победил! Загаданное число: " + hiddenNumber);
				} else if (playerTwoNumber == hiddenNumber) {
					System.out.println(playerTwoName + " победил! Загаданное число: " + hiddenNumber);
				}
			System.out.println("Хотите продолжить? [yes/no]: ");
			againGame = scan.next();
			while (!againGame.equals("no") && !againGame.equals("yes")) {
				System.out.println("Введены неверные данные. Хотите продолжить? [yes/no]: ");
				againGame = scan.next();
			}
		} while (againGame.equals("yes"));
		System.out.println("Игра окончена!");
	}
}