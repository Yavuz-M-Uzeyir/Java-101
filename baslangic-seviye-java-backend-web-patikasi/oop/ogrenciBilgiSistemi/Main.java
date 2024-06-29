package patikaProjeler.oop.ogrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Üzeyir", "555", "TRH");
        Teacher t2 = new Teacher("Nisanur", "666", "FZK");
        Teacher t3 = new Teacher("Muhammed", "333", "BIO");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "101", "FZK");
        fizik.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji", "101", "BIO");
        biyoloji.addTeacher(t3);

        Student s1 = new Student("Mahmut", "131", "2", tarih, fizik, biyoloji);
        s1.addBulkExamNote(55, 55, 70, 40, 40, 40);
        s1.isPass();

        Student s2 = new Student("Mustafa", "321", "1", tarih, fizik, biyoloji);
        s2.addBulkExamNote(55, 65, 58, 100, 100, 100);
        s2.isPass();
    }
}
