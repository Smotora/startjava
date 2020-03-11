import java.util.Scanner;
public class MyFirstGame {
	public static void main(String[] args) {
		System.out.println("Попробуйте угадать целое число, загаданное в диапазоне (0; 100]: ");
		int numberComp = 1 + (int) (Math.random() * 101);
		Scanner scanNum = new Scanner (System.in);
		int numberUser = scanNum.nextInt();
		do {
			if (numberUser>numberComp){
			System.out.println("Ввёденное Вами число больше того, что загадано, продолжайте: ");
			numberUser = scanNum.nextInt();
			} else {
			System.out.println("Ввёденное Вами число меньше того, что загадано, продолжайте: ");
			numberUser = scanNum.nextInt();
			}
		} while (numberComp!= numberUser);
		if (numberComp == numberUser){
			System.out.println("Вы угадали!");
		}
	}
}