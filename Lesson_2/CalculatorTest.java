import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		String playAgain = null;
		Scanner scan = new Scanner(System.in);
		do {
		Calculator calc = new Calculator();
		
		System.out.println("Введите первое число: ");
		calc.getA();
		
		System.out.println("Введите операцию: ");
		calc.getOperator();

		System.out.println("Введите второе число:  ");
		calc.getB();
		
		System.out.println("Результат: " + calc.calculate());
		System.out.println("Хотите продолжить? [да/нет]: ");
		playAgain = scan.next();
		} while (playAgain.equals("да"));
		
		while (!playAgain.equals("да")) {
			if (playAgain.equals("нет")) {
				System.out.println("До встречи!");
				break;
			} else {
			System.out.println("Введены неверные данные. Хотите продолжить? [да/нет]: ");
			playAgain = scan.next();
			}
		}
	}
}