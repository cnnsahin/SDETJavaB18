package class18;

public class StringDemo {
    public static void main(String[] args) {
        String str="My phone number is 911";
        str=str.replaceAll("[^0-9]", " " );// it's ignore everthing except numbers
        System.out.println(str);


    }


}
