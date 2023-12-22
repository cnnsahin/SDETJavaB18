package review7;

public class MathTester {
    public static void main(String[] args) {
        Printer p=new Printer();
        //String s=p.printHello(); // you can not reach
   // becauese you creat with void method
        p.printHello();
        Math m=new Math();
       int result= m.add(10,20);
       int avg=result/2;
       String str="java";
       int len=str.length();
       if(len>4){
           System.out.println("Word accepted");
       }
        for (int i = 0; i < str.length(); i++) {

        }
   if( str.isBlank()){

   }
    }

}
