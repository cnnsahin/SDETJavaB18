package class23;

import java.util.ArrayList;
import java.util.HashSet;

public class E3Sets {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        System.out.println(numbers);// output [10,20,10]


        HashSet<Integer> nums= new HashSet<>();
        nums.add(10);// if you are duplicate data they will ignore duplicates
        nums.add(20);// you can not store data more than once
        nums.add(10);
        // no get method because keeps randomly// nums.get(0); doesnt work
        System.out.println(nums);// output is [20,10]
    }
}
