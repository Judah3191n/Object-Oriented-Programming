package library.management;

import library.books.Book;
import java.util.ArrayList; //arraylist to hold the books

public class Library {
    private ArrayList<Book> books;

    public Library() {// constructor to inicalize arraylist
        books = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        books.add(book);
    }

    public void showBooks() {
        System.out.println("----------Book Details----------");
        for (Book i : books) {
            i.displayDetails();
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Harry Potter", "J.K Rowling");
        library.addBook("Burning Bridge", "John Flnanagan");
        library.showBooks();
    }
}
