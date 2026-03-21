import java.util.ArrayList;

class Book {
    String title;
    String author;
    String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    void display() {
        System.out.println(title + " " + author + " " + isbn);
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void removeBook(String isbn) {
        for (Book b : books) {
            if (b.isbn.equals(isbn)) {
                books.remove(b);
                break;
            }
        }
    }

    void displayBooks() {
        for (Book b : books) {
            b.display();
        }
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(new Book("Java", "James", "101"));
        lib.addBook(new Book("Python", "Guido", "102"));

        lib.displayBooks();

        lib.removeBook("101");

        lib.displayBooks();
    }
}