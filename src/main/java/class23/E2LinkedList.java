package class23;

import class16.Dog;

import java.util.LinkedList;
import java.util.List;

public class E2LinkedList {
    public static void main(String[] args) {
        LinkedList<String> names= new LinkedList<>();
        // we can write
       // List<String> names= new LinkedList<>();
        names.add("Kat");
        names.add("Canan");
        names.add("Maria");
        names.add("Karimi");
        names.remove(0);
        System.out.println(names);


    }
}
