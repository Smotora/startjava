public class Unicode {
	public static void main(String[] args) {
		System.out.println("Символы UNICODE в диапазоне [9398, 10178]: " );
		for (int i = 9398; i <= 10178; i++) {
			System.out.println("Символ № " + i + ": " + (char) i);
		}
	}
}