public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfTest = new Wolf();
        wolfTest.sex = 'M';
        wolfTest.name = "Белый клык";
        wolfTest.weight = 50.5f;
        wolfTest.age = 3;
        wolfTest.color = "Белый";

        System.out.println("Пол волка: " + wolfTest.sex);
        System.out.println("Кличка волка: " + wolfTest.name);
        System.out.println("Вес волка в кг: " + wolfTest.weight);
        System.out.println("Возраст волка: " + wolfTest.age);
        System.out.println("Окрас волка: " + wolfTest.color);
        System.out.println("В среднем за день может пройти км: " + wolfTest.walk());
        wolfTest.sit();
        System.out.println("В среднем за день может пробежать км: " + wolfTest.run());
        System.out.println("Звук, с которым воет: " + wolfTest.howl());
        System.out.println(wolfTest.hunt());
    }
}
