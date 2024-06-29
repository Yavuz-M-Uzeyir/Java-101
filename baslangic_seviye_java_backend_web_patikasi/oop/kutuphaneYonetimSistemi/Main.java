package baslangic_seviye_java_backend_web_patikasi.oop.kutuphaneYonetimSistemi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        int choice;
        boolean loop = true;
        System.out.println("Kütühane Yönetim Sistemine Hoşgeldiniz");
        while (loop) {
            System.out.println("--------------------------------------");
            System.out.print("Kitap eklemek için (1)\n" +
                    "Kitap silmek için (2)\n" +
                    "Kitap güncellemek için (3)\n" +
                    "Kitap aramak için (4)\n" +
                    "Kitapları görüntülemek için (5)\n" +
                    "Çıkış yapmak için (6)\n" +
                    "Seçiminiz : ");
            choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println("--------------------------------------");

            switch (choice) {
                case 1:
                    System.out.print("Adı: ");
                    String name = scanner.nextLine();

                    System.out.print("Yazarı: ");
                    String author = scanner.nextLine();

                    System.out.print("basım yılı: ");
                    String year = scanner.nextLine();

                    System.out.print("İsbnNo: ");
                    String isbnNo = scanner.nextLine();

                    Book book = new Book(name, author, year, isbnNo);
                    library.addBook(book);
                    break;

                case 2:
                    System.out.print("IsbnNo: ");
                    String delIsbnNo = scanner.nextLine();
                    library.removeBook(delIsbnNo);
                    break;

                case 3:
                    break;

                case 4:
                    System.out.print("IsbnNo: ");
                    String findIsbnNo = scanner.nextLine();
                    library.findBook(findIsbnNo);
                    break;

                case 5:
                    System.out.println("Kütüphanedeki kitaplar: ");
                    library.displayBooks();
                    break;

                case 6:
                    System.out.print("Çıkış yapıldı");
                    loop = false;
                    break;
            }
        }
    }
}
