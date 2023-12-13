package class16;

public class Cat  extends Animal{
    String name;
    String color;
    int age;
    double weight;
    void sleep(){
        System.out.println("ZZZZZZ");
    }
    public void printInfo(){
        System.out.println(name + " " +color+ " " +age+ " " + weight);

    }
}
