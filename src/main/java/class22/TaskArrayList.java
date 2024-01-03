package class22;

import java.util.ArrayList;

public class TaskArrayList {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Canan");
        names.add("Poorna");
        names.add("Damla");
        names.add("Muhayyo");
        names.add("Engin");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Canan"));
        System.out.println(names.size());
        System.out.println(names);


    }
}
