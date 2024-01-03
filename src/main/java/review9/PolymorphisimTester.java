package review9;

public class PolymorphisimTester {
    public static void main(String[] args) {
        Dog d = new Dog("Jacky", "black", 1, "German");
        Cat c = new Cat("Mano", "white", 5);
        Animal[] animals = {d, c};
        for (Animal a : animals) {
            a.eat();
            a.speak();
            a.printInfo();
           String r= a.getName();
            System.out.println(a.getName());
          /*  if(a instanceof Dog){
                Dog d2=(Dog).a;
                d2.run();
            }*/
        }
        //Upcasting
        Animal a= animals[0];// dog converted
        ((Dog)a).run();
        Dog d2=(Dog)a;//downcasting
        d2.run();
        }


    }
