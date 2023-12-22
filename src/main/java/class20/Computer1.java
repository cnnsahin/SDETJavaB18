package class20;

public abstract class Computer1 {


    // every abstract class Must participate inheritance
    // abstract means something is incompleted
// we cannot create an object
    /* Optional            Optional                  Must  Must
    access modifiers non access modifier   dataType name;
     */

        public static String type;
        public String name;// public access modifier
        protected int memory;// access modifier is protected
        String color;// default access modifier
        public Computer1 (String name, int memory, String color){// I can add acess modifier for my constructor type is public here
            this.name=name;
            this.memory= memory;
            this.color= color;
        }
        /*  optional        optional             must   must
        access modifiers non access modifier returnType name (){}
         */
        public static void playMusic(){// we add public to static
            System.out.println("I can play music on my " + type);// you can only reach static ones not name only type

        }
        protected  void printInfo(){
            System.out.println("I have " + name+ " computer with  " + memory+ " memory");
        }
        abstract void executeCode();// no implemementation
        public abstract void readEmails();// we hiding implementatation details with abstract keyword
    }
class Apple extends Computer1 {

        public Apple(String name, int memory,String color){
            super(name,memory,color);
        }
        // when we provide implementation to the abstract classes we MUST follow rules of Overriding!!!
    // same method name and parameter MUST be same-method signature MUST be same
    // return type MUST be same
    // Access modifier must be same or wider
        void executeCode(){
            System.out.println("Executing code on " +type+ " " + name);

        }
        public void readEmails(){
            System.out.println(name + " can read my emails");
        }
}

