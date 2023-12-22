package class18;

public class Animal {
    private String name;
   private String color;
    private int age;
    private double weight;
    public Animal (String name, String color, int age, double weight){// create constructor to reach inheritance vaeiables
        this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;
    }
    void sleep(){
        System.out.println("Zzzzzzzz");
    }
   public void speak(){
        System.out.println("Animal speaking ");
    }
    public void printInfo(){
        System.out.println(name + "" + color+ "" +age+ " " + weight);
    }
}
class Dog extends Animal{
    Dog(String name, String color, int age, double weight ){
    super( name,color,age,weight);// call constructor with super keyword
        /*Dog(){
        super( "Jacky", "black", 12,20.2);
         */

    }

}

