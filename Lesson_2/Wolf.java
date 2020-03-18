public class Wolf {
    char sex;
    String name;
    float weight;
    int age;
    String color;

    int walk() {
        int walkDistance = 80;
        return walkDistance;
    }

    void sit() {
        System.out.println("Сидит");
    }

    int run() {
        int runDistance = 20;
        return runDistance;
    }

    String howl() {
        return "У-у-у";
    }

    boolean hunt() {
        System.out.println("Добывает пищу охотой");
        return true;
    }
}



