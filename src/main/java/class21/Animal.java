package class21;

public abstract class Animal {

    private String name;
    private String color;
    static int noOfLegs;
    public abstract void eat();
    public Animal(String name, String color){
        this.name=name;
        this.color=color;
    }
    public void sleep(){
        System.out.println("Animals sleep");
    }

    public abstract void speak();
    public void printInfo(){
        System.out.println(name + "" + "" + color);
    }
}
class Dog extends Animal {
    public Dog(String name, String color){
        super(name,color);

    }
    @Override
    public void eat() {
        System.out.println("Dogs like eat meat");
    }
    public void speak(){
        System.out.println("Wuff wufff");
    }
}
class Cat extends Animal {
public Cat (String name, String color){
    super(name,color);
}
    @Override
    public void eat() {
        System.out.println("Cats like to eat fish ");
    }

    public void speak(){
        System.out.println("Meoww meowww");
    }
}