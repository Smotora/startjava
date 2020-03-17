class Person {
	char sex = 'F';
	String name = "Svetlana";
	float height = 1.7f;
	float weight = 52.1f;
	int age = 26;

	void walk() {
		System.out.println ("Я могу ходить");
	}

	void sit() {
		System.out.println ("Я могу сидеть");
	}

	int run() {
		int distance = 5;
		return distance;
	}

	String speak() {
		return "Привет! Меня зовут Светлана.";
	}

	boolean learnJava() {
		System.out.println("Я изучаю Java");
		return true;
	}
}