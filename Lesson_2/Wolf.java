public class Wolf {
    private char sex;
    private String name;
    private float weight;
    private int age;
    private String color;

    public char getSex() {
        return sex;

    }
    public void setSex(char sex) {
        if (sex != 'M' & sex != 'F') {
            System.out.println("Некорректный пол");
        } else {
            this.sex = sex;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == "") {
            System.out.println("Не введена кличка");
        } else {
            this.name = name;
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight <= 0) {
            System.out.println("Некорректный вес");
        } else {
            this.weight = weight;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        if (color == "") {
            System.out.println("Не введен цвет");
        } else {
            this.color = color;
        }
    }

    public int walk() {
        int walkDistance = 80;
        return walkDistance;
    }

    public void sit() {
        System.out.println("Сидит");
    }

    public int run() {
        int runDistance = 20;
        return runDistance;
    }

    public String howl() {
        return "У-у-у";
    }

    public boolean hunt() {
        System.out.println("Добывает пищу охотой");
        return true;
    }
}
