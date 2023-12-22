package class18;

public class BookTester {
    public static void main(String[] args) {
        EBook eBook = new EBook("Les Misarebles", "Victor Hugo", "9780134445522", "https://example.com/lesMisarebles-book");
        System.out.println("EBook Details:");
        eBook.displayBookDetails();
        System.out.println();

        PrintBook printBook = new PrintBook("Husband's Lies", "Liane Moriarty", "978013232244", 250);
        System.out.println("Print Book Details:");
        printBook.displayBookDetails();
    }
}



