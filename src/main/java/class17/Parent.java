package class17;
class GrandParent{
    GrandParent(){
        System.out.println(" GrandPa is born");
    }
}
public class Parent {

    Parent(){
        System.out.println("Parent is born");
    }
    String name= " israel";
}
class Child extends Parent{
    String name="Maria";//instance variable
    void print(){//local variable
        String name=" Levi";
       // System.out.println(this.name);//if we put this here output will be Maria
        System.out.println(super.name);// output will be israel
    }
}
class Tester{
    public static void main(String[] args) {
        Child c=new Child();
        c.print();// Levi will be output because Levi is local
    }
}