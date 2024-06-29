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
        return "Kitap Bilgileri {" +
                "  Adı: " + this.name +
                ", Yazarı: " + this.author +
                ", Basım yılı: " + this.year +
                ", İsbnNo: " + this.isbnNo +
                "  }";
    }

    public String getIsbnNo() {
        return this.isbnNo;
    }

    public String getYear() {
        return this.year;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }


}
