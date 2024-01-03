package review9;

public interface Washable {

    public static final int age=20;// by default every variable public static final even we dont write public static final
    void wash();// it can not be final because its dafult abstract 
}
interface Trustable{
    void trust();
}
class Horse implements Washable, Trustable{


    @Override
    public void wash() {
        System.out.println("Washing the horse");

    }

    @Override
    public void trust() {
        System.out.println("Horses can be trusted they are loyal");
    }
}
class Car implements Washable, Trustable{


    @Override
    public void wash() {
        System.out.println("washing the car");

    }

    @Override
    public void trust() {
        System.out.println("You can trust Toyota cars");
    }
}
class Laptop{

}