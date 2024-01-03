package class22;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        //names.add(12); error because it should be String
        System.out.println(names.size());// output is 0
        names.add("Bikal");
        System.out.println(names.contains("Bikal"));// output will be true
        System.out.println(names.size());// output is 1
        names.remove("Bikal");
        System.out.println(names.size());// now size is 0 again




    }
}
