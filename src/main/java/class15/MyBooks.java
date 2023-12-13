package class15;

public class MyBooks {
    private String name;
    private String author;
    private int price;
    private int year;

    public MyBooks(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;

    }
    public MyBooks (String name, String author, int price, int year){
        this( name,author,price);
        this.year = year;
    }
    void printInfo(){
        System.out.println(name + " " + author + " " + price + " " + year);
    }
    void printInfo2(){
        System.out.println(name+ " " + author+ " " + price + " " +year);}

    public static void main(String[] args) {
        MyBooks b1= new MyBooks( " Les Miserables", "Victor Hugo",45);
        b1.printInfo();
        MyBooks b2=new MyBooks( " Husband's Lies", " Liane Moriarty", 40,+ 2020);
        b2.printInfo2();// we can only write new book not necessarry Book b1=new Book
    }
// new Book( " Les Miserebles", "" + "Victor Hugo", 45).printInfo();
    //new Book( " HUsband's Lies", "" + "Liane Moriary", 40, 2020).printInfo2(); It's another way to get output
}

