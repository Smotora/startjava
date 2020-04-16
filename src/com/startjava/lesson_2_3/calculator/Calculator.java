package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class Calculator {
	Scanner scan = new Scanner(System.in);
	private double a;
	private char operator;
	private double b;
	
	public double getA() {
		while (!scan.hasNextDouble()) {
			System.out.println("Введеные данные не являются числом. Повторите ввод первого числа: ");
			scan.next();
		}
		return a = scan.nextDouble();
	}

	public char getOperator() {
		while (!scan.hasNext("[-+*/^%]")) {
			System.out.println("Введеные данные не являются арифметической операцией. Повторите ввод операции: ");
			scan.next();
		}
		return operator = scan.next().charAt(0);
	}

	public double getB() {
		while (!scan.hasNextDouble()) {
			System.out.println("Введеные данные не являются числом. Повторите ввод первого числа: ");
			scan.next();
		} 
		return b = scan.nextDouble();
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