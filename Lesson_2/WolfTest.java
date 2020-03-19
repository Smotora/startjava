public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfTest = new Wolf();
        
        wolfTest.setSex('F');
        System.out.println("Пол волка: " + wolfTest.getSex());

        wolfTest.setName("Жучка");
        System.out.println("Кличка волка: " + wolfTest.getName());

        wolfTest.setWeight(45.2f);
        System.out.println("Вес волка в кг: " + wolfTest.getWeight());

        wolfTest.setAge(5);
        System.out.println("Возраст волка: " + wolfTest.getAge());

        wolfTest.setColor("Серый");
        System.out.println("Окрас волка: " + wolfTest.getColor());

        System.out.println("В среднем за день может пройти км: " + wolfTest.walk());
        wolfTest.sit();
        System.out.println("В среднем за день может пробежать км: " + wolfTest.run());
        System.out.println("Звук, с которым воет: " + wolfTest.howl());
        System.out.println(wolfTest.hunt());
    }
}
