package class22;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Maria");
        names.add("Poorna");
        names.add("Damla");
        names.add("Kamla");
        System.out.println(names.size());
        System.out.println(names.contains("Kamla"));// true or false
        System.out.println(names);
        //System.out.println(names.remove("Kamla"));// this name will be gone
        // you can remove with index
        System.out.println(names.remove(3));// Kamla is gone
        System.out.println(names.get(0));// Maria
        names.set(0,"Nasima");// instead of Maria we will see Nasima at 0 index
        System.out.println(names);
        System.out.println(names.indexOf("Damla"));// index of Damla
        System.out.println(names.indexOf("Carlos")); //-1 because its not in the ArrayList



    }
}
