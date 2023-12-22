package class17;

class Animal{
   private String name;
   private String color;
    private int age;
    private double weight;
    public Animal(){

    }
    public Animal (String name,String color,int age,double weight){
        this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;
    }
    public void printInfo(){
        System.out.println(name+ " " +color+ " " + age+ " " + weight);
    }

}
public class Dog extends Animal{
    Dog(String name, String color, int age, double weight){
        super(name,color,age,weight);
    }
}
/*public class Dog {
    String name;
    String color;
    int age;
    double weight;
}*/
 class Cat extends Animal{
    //Cat(){//no argument classes default constructor
       // System.out.println("1");
      //super();// its called empty one
      //if you dont create java create default classes

        }

