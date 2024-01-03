package class22;

public class MathTester {
    public static void main(String[] args) {
        //we can't create the object of interfaces
        //Calculator c=new Calculator (); error
        Math m= new Math();// we can Calculator m=new Math();
        int r= m.add(10,10);
        System.out.println(r);

    }


}
