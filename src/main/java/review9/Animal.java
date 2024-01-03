package review9;

public abstract class Animal {
    private String name;
   private  String color;
    private int age;

   public  Animal (String name, String color, int age){
       this.name=name;
       this.color=color;
       this.age=age;

    }
    public String getName(){
       String name="test";
       return this.name;// this is optional here
    }
   public abstract void eat();
       // System.out.println("Eating"); it's useless because every child eat different things

   public  abstract void speak();
    public void printInfo(){

        System.out.println(name+ " " + color+ " " + age);
    }
}
class Dog extends Animal{
    String breed;
    public Dog(String name, String color, int age, String breed ){
        super(name,color,age);// super should be here
        this.breed=breed;
    }

    @Override
    public void eat() {
        System.out.println("Dogs like eat bones and meat");
    }

    @Override
    public void speak() {
        System.out.println("Wao wao Wuff Wuff");
    }

    @Override
    public void printInfo() {

        System.out.println(breed);// we can add print info child classes method
    }

    public void run() {
        System.out.println("Dog running");

    }

}
class Cat extends Animal{


    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void eat() {
        System.out.println("Cats like to eat fish");

    }

    @Override
    public void speak() {
        System.out.println("Meoww meowww");

    }


}