package review7;

public class Dog {

    String name;//instance variables inside the class but outside any methods, if conditions or loopsString color;
    int age;
    String color;
    double weight;
    //whenever you are planning to reuse a variable in more than two methods of your class
    // create an instance variable for that
    public Dog(String name, String color, int age, double weight){
        this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;
    }

    void printInfo(){
        System.out.println(name+""+color+""+age+""+weight);
    }

}

