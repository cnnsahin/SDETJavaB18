package class11;

public class E6StringDEmo {
    public static void main(String[] args) {

        String str="Java is Fun";
        char c=  str.charAt(5);
        System.out.println(c);//'i' is output

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));//Java is fun output
        }
}}
