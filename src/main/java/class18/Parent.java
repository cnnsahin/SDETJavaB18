package class18;

public class Parent {// public final class Parent if you put final class no other class no  overriding

     void marry(){// if you use final keyword no child class overridding overloading yes but no overriding
        System.out.println("Marry the girl that have selected for you");

    }
    void sleep(){
        System.out.println("Sleep 8 hours");
    }
}
     class Karimi extends Parent{
    void marry(){
        System.out.println("I want to marry Scarlet Johnson");
    }

}
class Tester{
    public static void main(String[] args) {
        Karimi k=new Karimi();
        k.marry();//Marry the girl that we have selected
        k.sleep();
    }
}