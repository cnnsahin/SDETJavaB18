package class19;

public class E2Poly {
    public static void main(String[] args) {
        Dog d1 = new Dog("Jacky", "Brown", 10, 25);
        Dog d2 = new Dog("Macky", "Black", 10, 25);
        //Dog []arr={d1,d2};
        Cat c1 = new Cat("Lulu", "Black", 10, 25);
        Animal a1 = new Animal("Animal", "Yellow", 10, 25);

        Animal [] arr={d1,d2,c1,a1};

        Animal a2=arr[0];
        a2.printInfo();// output d1 jacky dog

        Animal animal=arr[1];//output will be d2 Macky dog
        animal.printInfo();
        //Cat c=(Cat)arr[2]; output will be lulu

    }
}