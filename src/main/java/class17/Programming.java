package class17;

public class Programming {
    private String language;
    public Programming(String language){
        this.language=language;
    }
    public void printMessage(){
        if (language == null){
            System.out.println("I love programming languages");
        }else{
            System.out.println("I love " + language);
        }
    }

    public static void main(String[] args) {
        Programming p= new Programming(null);
        p.printMessage();
        Programming pj= new Programming("Java");
    }
}
