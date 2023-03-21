package Assignment4;

import java.util.ArrayList;
import java.util.List;

public class Library {
    // Add the missing implementation to this class
    String address;
    List<String>bookList = new ArrayList<String>();
    List<String>borrowedList = new ArrayList<String>();
    static void printOpeningHours() {
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }
    Library (String libraryAddress) {
        address = libraryAddress;
    }
    void printAddress() {
        System.out.println(address);
    }
    void addBook(Book book) {
        bookList.add(book.getTitle());
    }
    void borrowBook(String bookTitle) {
        if (bookList.contains(bookTitle)) {
            System.out.println("You successfully borrowed " + bookTitle);
            borrowedList.add(bookTitle);
            bookList.remove(bookTitle);
        }
        else if (borrowedList.contains(bookTitle)) {
            System.out.println("Sorry, this book is already borrowed.");
        }
        else{
            System.out.println("Sorry, this book is not in our catalog.");
        }
    }
    void returnBook(String bookTitle) {
        bookList.add(bookTitle);
        System.out.println("You successfully returned " + bookTitle);
    }
    void printAvailableBooks() {
        if (bookList.size() != 0) {
            for (int i = 0; i<bookList.size();i++) {
                System.out.println(bookList.get(i));
            }
        }
        else
            System.out.println("No book in catalog");
    }

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}