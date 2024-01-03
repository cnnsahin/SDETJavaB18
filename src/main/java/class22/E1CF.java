package class22;

import java.util.Arrays;

public class E1CF {
    public static void main(String[] args) {
        String name="Maria";
        String [] names={"Canan", "Halil", "Swati"};
       // names[3]= "Bikal" you cann not because array size is 3 and limited

        //String[] students=new String[]; we should specified size we should write [3] for example
        String[] students=new String[3];
        System.out.println(students.length);
        System.out.println(Arrays.toString(students)); // we can reach without loops


    }
}
