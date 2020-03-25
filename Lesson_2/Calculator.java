import java.util.Scanner;

public class Calculator {
	Scanner scan = new Scanner(System.in);
	private double a;
	private char operator;
	private double b;

	public double getA() {
		if (scan.hasNextDouble()) {
			a = (scan.nextDouble());
		} else {
			System.out.println("Введеные данные не являются числом. Повторите ввод первого числа: ");
			scan.next();
			a = getA();
		}
		return a;
	}

	public char getOperator() {
		if (scan.hasNext("[-+*/^%]")) {
			operator = scan.next().charAt(0);
		} else {
			System.out.println("Введеные данные не являются операцией. Повторите ввод операции: ");
			scan.next();
			operator = getOperator();
		}
		return operator;
	}

	public double getB() {
		if (scan.hasNextDouble()) {
			b = (scan.nextDouble());
		} else {
			System.out.println("Введеные данные не являются числом. Повторите ввод второго числа: ");
			scan.next();
			b = getB();
		}
		return b;
	}

	public double calculate() {
		double totalResult = 0;
		switch (operator)
			{
			case '+' :
				totalResult = (a + b);
				break;
			case '-' :
				totalResult = (a - b);
				break;
			case '*' :
				totalResult = (a * b);;
				break;
			case '/' :
				totalResult = (a / b);
				break;
			case '^' :
				double result = 1.0;
				double i = 1.0;
				while (i <= b) {
					result *= a;
					i++;
				}
				totalResult = (a / b);
				break;
			case '%' :
				totalResult = (a % b);
				break;
			}
		return totalResult;
	}
}