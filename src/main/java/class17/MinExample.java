package class17;

public class MinExample {
    public static void main(String[] args) {
        int result1= min( 10,5);
        double result2=min(2.5,3.5);
        System.out.println(result1);
        System.out.println(result2);
    }
   static int min (int a, int b){
        if(a<b){
    return a;
       }else{
            return b;
        }
   }
    static double min(double a,double b){
       if (a<b){
           return a;
       }else{
           return b;
       }
    }
}
