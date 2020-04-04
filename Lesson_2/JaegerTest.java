public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger();
		jaegerOne.setModelName ("Saber Athena");
		System.out.println("Model Name Jaeger One: " + jaegerOne.getModelName());

		jaegerOne.setMark("Mark - VII");
		System.out.println("Mark Jaeger One: " + jaegerOne.getMark());

		jaegerOne.setOrigin("China");
		System.out.println("Origin Jaeger One: " + jaegerOne.getOrigin());

		jaegerOne.setHeight(252f);
		System.out.println("Height Jaeger One in ft: " + jaegerOne.getHeight());

		jaegerOne.setWeight(1.638f);
		System.out.println("Weight Jaeger One in tons: " + jaegerOne.getWeight());

		jaegerOne.setSpeed(11);
		System.out.println("Speed Jaeger One: " + jaegerOne.getSpeed());

		jaegerOne.setStrength(8);
		System.out.println("Strength Jaeger One: " + jaegerOne.getStrength());

		jaegerOne.setArmor(5);
		System.out.println("Armor Jaeger One: " + jaegerOne.getArmor());

		System.out.println(jaegerOne.pilot());
		jaegerOne.move();

		Jaeger jaegerTwo = new Jaeger();
		jaegerTwo.setModelName("November Ajax");
		System.out.println("Model Name Jaeger Two: " + jaegerTwo.getModelName());

		jaegerTwo.setMark("Mark - VI");
		System.out.println("Mark Jaeger Two: " + jaegerTwo.getMark());

		jaegerTwo.setOrigin("PPDC");
		System.out.println("Origin Jaeger Two: " + jaegerTwo.getOrigin());

		jaegerTwo.setHeight(259f);
		System.out.println("Height Jaeger Two in ft: " + jaegerTwo.getHeight());

		jaegerTwo.setWeight(2.055f);
		System.out.println("Weight Jaeger Two in tons: " + jaegerTwo.getWeight());

		jaegerTwo.setSpeed(4);
		System.out.println("Speed Jaeger Two: " + jaegerTwo.getSpeed());

		jaegerTwo.setStrength(5);
		System.out.println("Strength Jaeger Two: " + jaegerTwo.getStrength());

		jaegerTwo.setArmor(4);
		System.out.println("Armor Jaeger Two: " + jaegerTwo.getArmor());

		jaegerTwo.useWeapon();
		System.out.println(jaegerTwo.attackKaiju());
	}
}