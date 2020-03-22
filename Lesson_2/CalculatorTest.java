import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator calculatorTest = new Calculator();
		
		System.out.println("Введите первое число: ");
		calculatorTest.getA();
		
		System.out.println("Введите операцию: ");
		calculatorTest.getOperator();

		System.out.println("Введите второе число:  ");
		calculatorTest.getB();
		
		System.out.println("Результат: " + calculatorTest.total());
	}
}