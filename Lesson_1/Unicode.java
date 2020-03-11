public class Unicode {
	public static void main(String[] args) {
		System.out.println("Символы UNICODE в диапазоне [9398, 10178]: " );
		for (int symbol = 9398; symbol <= 10178; symbol++) {
			System.out.println("Символ № " + symbol +": "+ (char) symbol);
		}
	}
}