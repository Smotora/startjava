import java.util.Scanner;
public class Calculator {
	public static void main (String[] args) {
	Scanner scanA = new Scanner (System.in);
	double a;
		System.out.println ("Введите первое число: ");
		while (!scanA.hasNextInt()) {
			System.out.println ("Введеные данные не являются числом. Повторите ввод первого числа: ");
			scanA.next();
		}
	a = scanA.nextDouble();
	
	
	Scanner scanB = new Scanner (System.in);
	double b;

		System.out.println ("Введите второе число: ");
		while (!scanB.hasNextInt()) {
			System.out.println ("Введеные данные не являются числом. Повторите ввод второго числа: ");
			scanB.next();
		}
	b = scanB.nextDouble();

	Scanner scanOper = new Scanner (System.in);
	System.out.println ("Введите операцию: +, -, *, /");
	while (!scanOper.hasNext("[-+*/]")) {
			System.out.println ("Введеные данные не являются арифметической операцией. Повторите ввод операции: ");
			scanOper.next();
		}
	char oper = scanOper.next().charAt(0);

	if (oper == '+') {
		System.out.println ( "Сумма введённых чисел: " + (a + b));
	} else if (oper == '-') {
		System.out.println ( "Разность введённых чисел: " + (a - b));
	} else if (oper == '*') {
		System.out.println ( "Произведение введённых чисел: " + (a * b));
	} else if (oper == '/' & b==0) {
		System.out.println ("Деление на 0 запрещено!");
	} else {
		System.out.println ("Частное введённых чисел: " + (a / b));
		}
	}
}