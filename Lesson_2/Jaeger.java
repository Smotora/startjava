public class Jaeger {
	String modelName;
	String mark;
	String origin;
	float height;
	float weight;
	int speed;
	int strength;
	int armor;

	public Jaeger(String modelName, String mark, String origin, float height, float weight,int speed, int strength, int armor) {
		this.modelName = modelName;
		this.mark = mark;
		this.origin = origin;
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strength = strength;
		this.armor = armor;
	}

	public boolean pilot() {
		System.out.println("You are used by the pilot");
		return true;
	}

	public void useWeapon() {
		System.out.println("You use your weapon");
	}

	public void move() {
		System.out.println("You go forward");
	}

	String attackKaiju() {
		return "Attack the enemy";
	}
}