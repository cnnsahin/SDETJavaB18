package review7;

public class OverloadedExample {
    public static void main(String[] args) {
        OverloadedExample example = new OverloadedExample();
        example.overloadedMethod(6);
        example.overloadedMethod(2.12);
        example.overloadedMethod("Hello");
    }

    private void overloadedMethod(int number) {
        System.out.println("Integer dataType:" + number);
    }

    private void overloadedMethod(double number) {
        System.out.println("Double dataType:" + number);
    }
    private void overloadedMethod(String message){
        System.out.println("String dataType:" +message);
    }
}