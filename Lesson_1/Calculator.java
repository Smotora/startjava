import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double a;
		System.out.println ("Введите первое число: ");
		while (!scan.hasNextInt()) {
			System.out.println ("Введеные данные не являются числом. Повторите ввод первого числа: ");
			scan.next();
		}
		a = scan.nextDouble();
	
		double b;
		System.out.println ("Введите второе число: ");
		while (!scan.hasNextInt()) {
			System.out.println ("Введеные данные не являются числом. Повторите ввод второго числа: ");
			scan.next();
		}
		b = scan.nextDouble();

		System.out.println ("Введите операцию: +, -, *, /, ^, % ");
		while (!scan.hasNext("[-+*/^%]")) {
			System.out.println ("Введеные данные не являются арифметической операцией. Повторите ввод операции: ");
			scan.next();
		}
		char oper = scan.next().charAt(0);

		if (oper == '+') {
			System.out.println ( "Сумма введённых чисел: " + (a + b));
		} else if (oper == '-') {
			System.out.println ( "Разность введённых чисел: " + (a - b));
		} else if (oper == '*') {
			System.out.println ( "Произведение введённых чисел: " + (a * b));
		} else if (oper == '/' & b==0) {
			System.out.println ("Деление на 0 запрещено!");
		} else if (oper == '/') {
			System.out.println ("Частное введённых чисел: " + (a / b));
		} else if (oper == '^') {
			System.out.println ("Первое число в степени второго числа: " + Math.pow(a, b));
		} else {
			System.out.println ("Остаток от деления первого числа на второе: " + (a % b));
		}
	}
}