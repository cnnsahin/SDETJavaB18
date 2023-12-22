package class17;

public class OverloadedMethodExample {
    static void info(int number){
        System.out.println("That is a integer:" + number);
    }
    static void info(double number){
        System.out.println("That is  double:" + number);
    }
    static void info(String message){
        System.out.println("That is a String:" + message);
    }

    public static void main(String[] args) {
        info(24);
        info(3.5);
        info("How are you guys?");
    }
}
