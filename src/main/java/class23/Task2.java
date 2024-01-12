package class23;

import java.util.Set;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        Set<String> countries= new TreeSet<>();
        countries.add(" Germany");
        countries.add(" Italy");
        countries.add(" Turkey");
        countries.add(" Japan");
        countries.add(" Greece");
        System.out.println(countries);
        System.out.println("**************");
        for (String c:countries){
            System.out.println(c);
        }
    }
}
