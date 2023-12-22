package review7;
public class BirdHW {
    private String names;
    private String color;
    private int age;
    private boolean canFly;
    public BirdHW(String names, String color, int age, boolean canFly) {
        this.names = names;
        this.color = color;
        this.age = age;
        this.canFly = canFly;
    }
    public void printInfo() {
        System.out.println("Species: " + names);
        System.out.println("Color: " + color);
        System.out.println("Age: " + age + " years");
        System.out.println("Can Fly: " + (canFly ? "Yes" : "No"));
    }
}
class Sparrow extends BirdHW {
    public Sparrow(String color, int age, boolean canFly) {
        super("Sparrow", color, age, canFly);
    }
}
class Parrot extends BirdHW {
    public Parrot(String color, int age, boolean canFly) {
        super("Parrot", color, age, canFly);
    }
}

