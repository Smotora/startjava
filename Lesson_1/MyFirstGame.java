import java.util.Scanner;

public class MyFirstGame {
	public static void main(String[] args) {
		System.out.println("Попробуйте угадать целое число, загаданное в диапазоне (0; 100]: ");
		int hiddenNumber = (int) (Math.random() * 101);
		Scanner scanNum = new Scanner (System.in);
		int userNumber = scanNum.nextInt();

		do {
			if (userNumber>hiddenNumber) {
				System.out.println("Ввёденное Вами число больше того, что загадано, продолжайте: ");
				userNumber = scanNum.nextInt();
			} else {
				System.out.println("Ввёденное Вами число меньше того, что загадано, продолжайте: ");
				userNumber = scanNum.nextInt();
			}
		} while (hiddenNumber!= userNumber);
	}
}