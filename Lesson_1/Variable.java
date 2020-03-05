public class Variable {
	public static void main(String[] args) {
		byte win = 7;
		short intel = 7;
		int gpuSeries = 660;
		long ram = 6144;
		float cpu = 2.3f;
		double ind = 5.9;
		char hdd = 'C';
		boolean isLaptop = true;

		System.out.println("Version Windows: " + win);
		System.out.println("Intel Core i" + intel);
		System.out.println("NVIDEA GeForce GTX " + gpuSeries + "M");
		System.out.println("RAM:" + ram + " MB");
		System.out.println("CPU: " + cpu + "GHz");
		System.out.println("Windows System Assessment Tool: " + ind);
		System.out.println("One of HDD: " + hdd);
		System.out.println("Is the computer a laptop? " + isLaptop);
	}
}
