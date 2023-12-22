package review7;

public class Cat {
    private String name;
    String color;//default automaticlly
    public int age;

    void printName(){// it couldnt be static
        System.out.println(name);
        Cat c=new Cat();//instance
    }

    public static void main(String[] args) {
        Cat c=new Cat();
        c.name="kitti";// you can reach c.name because in same class
        c.color="white";
        c.age=15;
    }
}
class CatTester{
    public static void main(String[] args) {
        Cat c=new Cat();
       //you cannot reach cat name because you are different class c.name
        c.color="white";
    }
}