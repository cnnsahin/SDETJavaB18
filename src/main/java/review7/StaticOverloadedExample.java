package review7;

public class StaticOverloadedExample {
    public static void main(String[] args) {
        StaticOverloadedExample.overloadedMethod(6);
        StaticOverloadedExample.overloadedMethod(2.12);
        StaticOverloadedExample.overloadedMethod("Hello");
    }
    private static void overloadedMethod(int number){
        System.out.println("Integer dataType " + number);
    }
    private static void overloadedMethod(double number){
        System.out.println("Double dataType " + number);
    }
    private static void overloadedMethod(String message){
        System.out.println("String dataType " + message);
    }


}
