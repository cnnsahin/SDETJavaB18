package class14;

public class Cat {

    //instance variable
    String name="kitti";
    void printName(){
        //local variable
        // String name="Pishak"; if we dont write this output will be kitti
        System.out.println(name);
    }

    public static void main(String[] args) {
        Cat c= new Cat();
        c.printName();//Pishak local variable most important then instance
    }
}