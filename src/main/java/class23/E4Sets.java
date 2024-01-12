package class23;

import java.util.HashSet;

public class E4Sets {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        // preferred way is
        // Set<String> fruits= new HashSet<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Kiwi");
        fruits.add("Banana");
        fruits.add("Apple");// output only once Apple we will see
        System.out.println(fruits);


    }
}
