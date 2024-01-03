package class21;

public class AnimalTester {
    public static void main(String[] args) {
       // Animal animal= new Animal();
        //animal.eat(); you can not create object with abstract class
        Cat c= new Cat("lulu", "Black");
        c.eat();
        c.speak();
        c.sleep();
        Animal c2= new Cat("kitty", "white");
        Animal []arr= {new Cat(" lulu", "Black"), new Dog(" Snow", "white")};
        for (Animal a: arr){
            a.eat();
            a.sleep();
            a.speak();
        }
    }
}
