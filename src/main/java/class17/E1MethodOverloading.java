package class17;
class Math {

    static void add(int num1, int num2) {
        System.out.println(num1 + num2);// 2 int parameters

    }

    static void add(double num1, double num2) {// header signature
        System.out.println(num1 + num2);// 2  double parameters
    }

    static void add(double num1, double num2, double num3) {
        System.out.println(num1 + num2 + num3);// 3 double parameters
    }

    static void add(int num1, double num2) {
        System.out.println(num1 + num2);// 2  parameters 2 different datatypes
    }
}
public class E1MethodOverloading {
    public static void main(String[] args) {


    Math.add (10,20);// if I make it double get an error
        Math.add(15.5,24.2);// we changed double
        Math.add(15.2,52.1,61.3);// use 3 parameter double
        System.out.println(20);
        System.out.println("hello");
        System.out.println(true);
       // Math.max(5,2);// Math is overloading for example

}}
