package class22;

public interface Calculator {
    int add (int num1, int num2);
    int substract (int num1, int num2);


}
class Math implements Calculator{


    @Override
    public int add(int num1, int num2) {
        return num1+num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1-num2;
    }
}