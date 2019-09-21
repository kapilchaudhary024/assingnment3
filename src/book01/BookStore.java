package book01;
import java.util.Scanner;

public class BookStore {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        if (n == 0) {

            System.out.print("N/A");

        } else {

            while (n != 0) {

                Books book = new Books(scanner.nextLine(), scanner.nextLine(), scanner.nextLong());

                scanner.nextLine();

                System.out.println("\n-----------------------------\n" + book + "\n-----------------------------\n");

                n--;

            }

        }

    }

}

class Books{
    private String bookName;
    private String authorName;
    private long isbn;

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }


    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }


    public long getIsbn() {
        return isbn;
    }
    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }


    public Books(String bookName, String authorName, long isbn)
    {
        setAuthorName(authorName);
        setBookName(bookName);
        setIsbn(isbn);
    }


    @Override
    public String toString() {
        return "Book Name:\t" + getBookName() + "\nAuthor Name:\t" + getAuthorName() + "\nISBN:\t" + getIsbn();
    }
}