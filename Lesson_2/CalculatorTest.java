import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		String againCalc = null;
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
			System.out.println("Хотите продолжить? [yes/no]: ");
			againCalc = scan.next();
			do {
				if (againCalc.equals("no") | againCalc.equals("yes")) {
					break;
				} else {
				System.out.println("Введены неверные данные. Хотите продолжить? [yes/no]: ");
				againCalc = scan.next();
				}
			} while (!againCalc.equals("yes"));
		} while (againCalc.equals("yes"));
		System.out.println("До встречи!");
	}
}
