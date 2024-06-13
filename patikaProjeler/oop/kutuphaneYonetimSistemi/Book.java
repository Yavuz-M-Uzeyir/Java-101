package patikaProjeler.oop.kutuphaneYonetimSistemi;

public class Book {

    String name;
    String author;
    String year;
    String isbnNo;

    Book(String name, String author, String year, String isbnNo) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.isbnNo = isbnNo;
    }

    public String toString() {
        return "Kitap{" +
                "  Adı: " + this.name +
                ", Yazarı: " + this.author +
                ", Basım yılı: " + this.year +
                ", İsbnNo: " + this.isbnNo +
                "  }";
    }
}
