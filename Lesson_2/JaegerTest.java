public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger("Saber Athena", "Mark - VII", "China", 252f, 1.638f, 11, 8, 5);
		System.out.println("Model Name Jaeger One: " + jaegerOne.modelName);
		System.out.println("Mark Jaeger One: " + jaegerOne.mark);
		System.out.println("Origin Jaeger One: " + jaegerOne.origin);
		System.out.println("Height Jaeger One in ft: " + jaegerOne.height);
		System.out.println("Weight Jaeger One in tons: " + jaegerOne.weight);
		System.out.println("Speed Jaeger One: " + jaegerOne.speed);
		System.out.println("Strength Jaeger One: " + jaegerOne.strength);
		System.out.println("Armor Jaeger One: " + jaegerOne.armor);
		System.out.println(jaegerOne.pilot());
		jaegerOne.move();

		Jaeger jaegerTwo = new Jaeger("November Ajax", "Mark - VI", "PPDC", 259f, 2.055f, 4, 5, 4);
		System.out.println("Model Name Jaeger Two: " + jaegerTwo.modelName);
		System.out.println("Mark Jaeger Two: " + jaegerTwo.mark);
		System.out.println("Origin Jaeger Two: " + jaegerTwo.origin);
		System.out.println("Height Jaeger Two in ft: " + jaegerTwo.height);
		System.out.println("Weight Jaeger Two in tons: " + jaegerTwo.weight);
		System.out.println("Speed Jaeger Two: " + jaegerTwo.speed);
		System.out.println("Strength Jaeger Two: " + jaegerTwo.strength);
		System.out.println("Armor Jaeger Two: " + jaegerTwo.armor);
		jaegerTwo.useWeapon();
		System.out.println(jaegerTwo.attackKaiju());
	}
}