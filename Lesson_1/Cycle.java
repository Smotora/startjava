public class Cycle {
	public static void main(String[] args) {
		System.out.println("Числа на отрезке от 0 до 20: " );
		for (int i = 0; i <= 20; i++) {
			System.out.println(i);
		}

		int j = 6;
		System.out.println("Числа на отрезке от 6 до -6 с шагом 2: " );
		while (j >= -6) {
			System.out.println(j);
			j += -2;
		}

		int k = 10;
		int sum = 0;
		System.out.println("Сумма нечётных чисел на отрезке от 10 до 20: " );
		do {
			if (k % 2 != 0) {
				sum += k;
			} else {
				sum += 0;
			}
			k++;
		} while (k <= 20);
		System.out.println(sum);
	}
}