import java.util.Scanner;

public class GuessNumber {
	Scanner scan = new Scanner (System.in);
	Player playerOne;
	Player playerTwo;
	int hiddenNumber = (int) (Math.random() * 101);
	
    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }
    
	public void newGame() {
		System.out.println("Попробуйте угадать целое число, загаданное в диапазоне (0; 100]: ");
		while(true) {
			System.out.println(playerOne.getName() + ", Ваш ход. Введите число: ");
			playerOne.setPlayerNumber(scan.nextInt());
			playerOne.getPlayerNumber();
			if (playerOne.getPlayerNumber() > hiddenNumber) {
				System.out.println("Ввёденное Вами число больше того, что загадано.");
			} else if (playerOne.getPlayerNumber() < hiddenNumber) {
				System.out.println("Ввёденное Вами число меньше того, что загадано. ");
			} else if (playerOne.getPlayerNumber() == hiddenNumber) {
				System.out.println(playerOne.getName() + " победил! Загаданное число: " + hiddenNumber);
				break;
			}
			System.out.println(playerTwo.getName() + ", Ваш ход. Введите число: ");
			playerTwo.setPlayerNumber(scan.nextInt());
			playerTwo.getPlayerNumber();
			if (playerTwo.getPlayerNumber() > hiddenNumber) {
				System.out.println("Ввёденное Вами число больше того, что загадано.");
			} else if (playerTwo.getPlayerNumber() < hiddenNumber) {
				System.out.println("Ввёденное Вами число меньше того, что загадано. ");
			} else if (playerTwo.getPlayerNumber() == hiddenNumber) {
				System.out.println(playerTwo.getName() + " победил! Загаданное число: " + hiddenNumber);
				break;
			}
		} 
		
	}
}