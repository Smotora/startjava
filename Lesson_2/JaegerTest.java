public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger("Saber Athena", "Mark - VII", "China", 252f, 1.638f, 11, 8, 5);
		System.out.println("Model Name Jaeger One: " + jaegerOne.getModelName());
		System.out.println("Mark Jaeger One: " + jaegerOne.getMark());
		System.out.println("Origin Jaeger One: " + jaegerOne.getOrigin());
		System.out.println("Height Jaeger One in ft: " + jaegerOne.getHeight());
		System.out.println("Weight Jaeger One in tons: " + jaegerOne.getWeight());
		System.out.println("Speed Jaeger One: " + jaegerOne.getSpeed());
		System.out.println("Strength Jaeger One: " + jaegerOne.getStrength());
		System.out.println("Armor Jaeger One: " + jaegerOne.getArmor());
		System.out.println(jaegerOne.pilot());
		jaegerOne.move();

		Jaeger jaegerTwo = new Jaeger("November Ajax", "Mark - VI", "PPDC", 259f, 2.055f, 4, 5, 4);
		System.out.println("Model Name Jaeger Two: " + jaegerTwo.getModelName());
		System.out.println("Mark Jaeger Two: " + jaegerTwo.getMark());
		System.out.println("Origin Jaeger Two: " + jaegerTwo.getOrigin());
		System.out.println("Height Jaeger Two in ft: " + jaegerTwo.getHeight());
		System.out.println("Weight Jaeger Two in tons: " + jaegerTwo.getWeight());
		System.out.println("Speed Jaeger Two: " + jaegerTwo.getSpeed());
		System.out.println("Strength Jaeger Two: " + jaegerTwo.getStrength());
		System.out.println("Armor Jaeger Two: " + jaegerTwo.getArmor());
		jaegerTwo.useWeapon();
		System.out.println(jaegerTwo.attackKaiju());
	}
}