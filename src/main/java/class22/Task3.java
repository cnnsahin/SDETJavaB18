package class22;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
       words.add("Mug");
        words.add("lee");
        words.add("coffee");
        words.add("phone");
        words.add("Canan");

        words.removeIf(x->x.endsWith("e"));
        System.out.println(words);
    /*for (int i = 0; i <words.size() ; i++) {
        if(words.get(i).endsWith("e")){
            words.remove(i);
            i--;
        }*/

    }

}

