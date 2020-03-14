import java.util.Scanner;

public class MyFirstGame {
	public static void main(String[] args) {
		System.out.println("Попробуйте угадать целое число, загаданное в диапазоне (0; 100]: ");
		int hiddenNumber = (int) (Math.random() * 101);
		Scanner scan = new Scanner (System.in);
		int userNumber = scan.nextInt();

		do {
			if (userNumber > hiddenNumber) {
				System.out.println("Ввёденное Вами число больше того, что загадано, продолжайте: ");
				userNumber = scan.nextInt();
			} else if (userNumber < hiddenNumber) {
				System.out.println("Ввёденное Вами число меньше того, что загадано, продолжайте: ");
				userNumber = scan.nextInt();
			}
		} while (hiddenNumber != userNumber);
	}
}