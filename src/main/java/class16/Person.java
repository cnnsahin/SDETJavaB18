package class16;

public class Person {//parent / base /super class
    String name;
    int age;
    double weight;
    void printInfo(){
        System.out.println(name+ " " +age+ " " +weight);
    }
}
class Student extends Person{//child class

  char grade;
  void study(){

   }
}
class StudentTester{
    public static void main(String[] args) {
        Student s=new Student();
        s.age=12;

    }
}