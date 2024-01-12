package class23;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task3 {
    public static void main(String[] args) {
        Set<String> cities = new LinkedHashSet<>();
        cities.add("London");
        cities.add("Ankara");
        cities.add("Paris");
        cities.add("Atlanta");
        cities.add("Barcelona");
        System.out.println(cities);
        System.out.println("**************");
        cities.removeIf(x->x.startsWith("A"));
        System.out.println(cities);
        }

    }



