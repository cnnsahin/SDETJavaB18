package class19;

public class Computer {
    void research (){
        System.out.println(" You can resarch everything");}
        void start(){
            System.out.println(" It easily start");
        }
        void playMusic(){
            System.out.println("You can listen music from computers");
    }
    static class Apple extends Computer{
        void protect(){
            System.out.println(" Highly protect");
        }
        static class Lenova extends Computer{
            void price(){
                System.out.println("Lenova is a little expensive");
            }
          static   class HP extends Computer{
                void speed(){
                    System.out.println(" HP is so speed");
                }
              static  class Dell extends Computer{

                    void weight(){
                        System.out.println(" Dell is light");
                    }
                }
            }
        }

    }
}
