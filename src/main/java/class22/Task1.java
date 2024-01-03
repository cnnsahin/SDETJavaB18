package class22;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Maria");
        names.add("Poorna");
        names.add("Damla");
        names.add("Kamla");
        for (int i = 0; i <names.size() ; i++) {
            if(names.get(i).contains("o")){   // other way String s=names.get(i);
                names.set(i,"java");          // if(s.contains("o")){ names.set(i, "java");
            }

        }
        System.out.println(names);
    }
}
