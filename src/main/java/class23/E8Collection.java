package class23;

import java.util.*;

public class E8Collection {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);
        System.out.println(numbers);// output [10,20,30,10]
        HashSet<Integer> uniqueNumber= new HashSet<>(numbers);
        System.out.println(uniqueNumber);//[20,10,30]

        LinkedHashSet<Integer> uniqueNumber1= new LinkedHashSet<>(numbers);
        System.out.println(uniqueNumber1);//[10,20,30]

        TreeSet<Integer> treeSet=new TreeSet<>(uniqueNumber);
        System.out.println(treeSet);//[10,30,40] sorted elements

    }
}
