package review7;

public class E2TypesOfVariables {
    public static void main(String[] args) {
        /* local variable */
        if(10>5){
            int sum=0;// they are limited in scope only use this block of code
        }
        //Can't be use outside of the block they are created
       // System.out.println(sum); tht are limited for accesibility
        for (int i = 0; i < 10; i++) {
            String name="Jinko";

        }
        double weight=23;
    }
}
