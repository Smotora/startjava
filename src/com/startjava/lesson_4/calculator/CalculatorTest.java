package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		String againCalc;
		Scanner scan = new Scanner(System.in);
		do {
			Calculator calc = new Calculator();
			System.out.println("Введите математическое выражение черз пробелы: ");
			calc.getEnteredString();
			calc.splitExpression();
			System.out.println("Результат: " + calc.calculate());
			System.out.println("Хотите продолжить? [yes/no]: ");
			againCalc = scan.next();
			while (!againCalc.equals("no") && !againCalc.equals("yes")) {
				System.out.println("Введены неверные данные. Хотите продолжить? [yes/no]: ");
				againCalc = scan.next();
			}
		} while (againCalc.equals("yes"));
		System.out.println("До встречи!");
	}
}
