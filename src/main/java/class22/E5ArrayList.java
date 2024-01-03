package class22;

import java.util.ArrayList;

public class E5ArrayList {
    public static void main(String[] args) {
        // print yes if a name contains the
        // letter o otherwise no for all names


        ArrayList<String> names = new ArrayList<>();
        names.add("Maria");
        names.add("Poorna");
        names.add("Damla");
        names.add("Kamla");
        for (String n: names) {
            if (n.contains("o")) {
            System.out.println("There is an o include") ;
        } else {
            System.out.println("There is not o ");
        }




    }

}}

