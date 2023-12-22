package review7;

public class BirdHWTester {
    public static void main(String[] args) {

        Sparrow sparrow = new Sparrow("Brown", 2, true);
        System.out.println("Sparrow Information:");
        sparrow.printInfo();
        System.out.println();

        Parrot parrot = new Parrot("Colorful", 5, true);
        System.out.println("Parrot Information:");
        parrot.printInfo();
    }
}

