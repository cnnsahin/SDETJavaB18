package class23;

import java.util.TreeSet;

public class E7Sets {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(20);
        numbers.add(10);
        numbers.add(50);
        numbers.add(5);
        numbers.add(5);
      // they are so many methods for example numbers.stream().max();
        System.out.println(numbers);// output will be [5,10,20,50] sorted form
        for (int n : numbers) {// we can use enhanced loops
            if (n > 10) {
                System.out.println(n);// output will be 20,50
            }


        }
    }
}
