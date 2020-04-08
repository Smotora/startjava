import java.util.Scanner;

public class Player {
	private int playerNumber;
	private String name;
	Scanner scan = new Scanner (System.in);

	public String getName() {
		System.out.println("Введите имя игрока: ");
		name = scan.next();
		return name;
	}
	
	public int getPlayerNumber() {
		playerNumber = scan.nextInt();
		return playerNumber;
	}
	
}