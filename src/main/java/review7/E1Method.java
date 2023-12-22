package review7;

public class E1Method {
    void print(){//instance method because we dont write static

        System.out.println("Hello there");// this only defination this method only

       //static void print(){

}

    public static void main(String[] args) {
        //new E1Method().print();// we can create looks like too
        E1Method e1=new E1Method ();
        e1.print();
        String str=new String("Java");
        str.toLowerCase();
    }





}