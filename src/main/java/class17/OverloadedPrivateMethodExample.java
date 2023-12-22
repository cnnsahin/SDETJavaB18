package class17;

public class OverloadedPrivateMethodExample {
    public static void main(String[] args) {
        OverloadedPrivateMethodExample example= new OverloadedPrivateMethodExample();
        example.info(24);
        example.info(3.5);
        example.info("How are you guys?");
    }
    private void info(int number){
        System.out.println("That is a integer:" + number);
    }
    private void info(double number){
        System.out.println("That is a double:" + number);
    }
    private void info(String message){
        System.out.println("That is a String:" + message);
    }
}
