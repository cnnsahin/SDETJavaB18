package review10;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        double d=15;
    //Double g=15;

    ArrayList<Double> numbers=new ArrayList<>();
    numbers.add(15.0);
    numbers.add(25.0);
    numbers.add(35.5);
    numbers.add(40.0);
    numbers.add(50.0);
    numbers.remove(0);
    numbers.remove(25.0);
    System.out.println(numbers);


    }

}
