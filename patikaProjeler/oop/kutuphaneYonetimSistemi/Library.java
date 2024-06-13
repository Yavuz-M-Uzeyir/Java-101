package patikaProjeler.oop.kutuphaneYonetimSistemi;

import java.util.ArrayList;

public class Library {

    Book book;
    ArrayList<Book> books;

    Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(String isbnNo) {
        if (books.isEmpty()) {
            System.out.println("Silinecek kitap yok");
        } else if (books.removeIf(book -> book.isbnNo.equals(isbnNo))) {
            System.out.println("Kitap silindi");
        } else {
            System.out.println("IsbnNo ya ait kitap bulunamadı");
        }
    }

    public String updateBook(String isbnNo) {
        findBook(isbnNo);
        if (book.isbnNo.equals(isbnNo)) {
            return books.toString();
        }
        return null;
    }

    public Book findBook(String isbnNo) {
        for (Book book : books) {
            if (book.isbnNo.equals(isbnNo)) {
                return book;
            }
        }
        return null;
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Boş");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
