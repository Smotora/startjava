package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class Calculator {
	Scanner scan = new Scanner(System.in);
	private double a;
	private String operator;
	private double b;
	private String enteredString;
	private String [] expression = new String [3];

	public String getEnteredString() {
		return enteredString = scan.nextLine();
	}

	public void splitExpression() {
		String[] parts = enteredString.split(" ");
		for (int i = 0; i < 3; i++) {
			expression[i] = parts[i];
		}
		a = Integer.parseInt(expression[0]);
		operator = expression[1];
		b = Integer.parseInt(expression[2]);
	}

	public double calculate() {
		double totalResult = 0;
		switch (operator)
			{
			case "+":
				totalResult = (a + b);
				break;
			case "-":
				totalResult = (a - b);
				break;
			case "*" :
				totalResult = (a * b);;
				break;
			case "/" :
				totalResult = (a / b);
				break;
			case "^" :
				totalResult = Math.pow(a, b);
				break;
			case "%" :
				totalResult = (a % b);
				break;
			}
		return totalResult;
	}
}