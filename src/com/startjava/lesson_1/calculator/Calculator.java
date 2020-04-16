package com.startjava.lesson_1.calculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Введите первое число: ");
		while (!scan.hasNextDouble()) {
			System.out.println("Введеные данные не являются числом. Повторите ввод первого числа: ");
			scan.next();
		}
		double a = scan.nextDouble();
	
		System.out.println("Введите операцию: +, -, *, /, ^, % ");
		while (!scan.hasNext("[-+*/^%]")) {
			System.out.println("Введеные данные не являются арифметической операцией. Повторите ввод операции: ");
			scan.next();
		}
		char operator = scan.next().charAt(0);
		
		System.out.println("Введите второе число: ");
		while (!scan.hasNextDouble()) {
			System.out.println("Введеные данные не являются числом. Повторите ввод второго числа: ");
			scan.next();
		}
		double b = scan.nextDouble();
		
		if (operator == '+') {
			System.out.println( "Сумма введённых чисел: " + (a + b));
		} else if (operator == '-') {
			System.out.println( "Разность введённых чисел: " + (a - b));
		} else if (operator == '*') {
			System.out.println( "Произведение введённых чисел: " + (a * b));
		} else if (operator == '/' & b == 0) {
			System.out.println("Деление на 0 запрещено!");
		} else if (operator == '/') {
			System.out.println("Частное введённых чисел: " + (a / b));
		} else if (operator == '^') {
			double result = 1.0;
			double i = 1.0;
			while (i <= b) {
				result *= a;
				i++;
			}
			System.out.println("Первое число в степени второго числа: " + result);
		} else {
			System.out.println("Остаток от деления первого числа на второе: " + (a % b));
		}
	}
}