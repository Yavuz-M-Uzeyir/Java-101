package patikaProjeler.oop.kutuphaneYonetimSistemi;

import java.util.ArrayList;

public class Library {

    ArrayList<Book> books;

    Library() {
        this.books = new ArrayList<>();
        books.add("s");
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

    public Book findBook(String isbnNo) {
        for (Book book : books) {
            if (book.getIsbnNo().contains(isbnNo)) {
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
