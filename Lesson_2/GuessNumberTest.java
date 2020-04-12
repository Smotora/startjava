import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String againGame = null;
		do {
			System.out.println("Введите имя первого игрока: ");
			Player playerOne = new Player(scan.next());
			System.out.println("Введите имя второго игрока: ");
			Player playerTwo = new Player(scan.next());
			GuessNumber game = new GuessNumber(playerOne, playerTwo);
			game.newGame();
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