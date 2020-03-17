public class Person{
	char sex = 'F';
	String name = "Svetlana";
	float height = 1.7f;
	float weight = 52.1f;
	int age = 26;

	void walk() {
		System.out.println ("Я могу ходить");
	}

	void sit() {
	}

	void run() {
		System.out.println ("Я могу бегать");
	}

	String speak() {
		return "Я говорю";
	}

	boolean learnJava() {
		System.out.println("Я изучаю Java");
		return true;
	}
}