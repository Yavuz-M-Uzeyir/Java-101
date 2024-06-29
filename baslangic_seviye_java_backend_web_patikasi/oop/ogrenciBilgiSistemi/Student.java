package baslangic_seviye_java_backend_web_patikasi.oop.ogrenciBilgiSistemi;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    double cAvarage1;
    double cAvarage2;
    double cAvarage3;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.cAvarage1 = 0;
        this.cAvarage2 = 0;
        this.cAvarage3 = 0;
        this.avarage = 0;
    }

    void addBulkExamNote(int note1, int note2, int note3, int vb1, int vb2, int vb3) {
        if ((note1 >= 0 && note1 <= 100) && (vb1 >= 0 && vb1 <= 100)) {
            this.c1.note = note1;
            this.c1.verbalNote = vb1;
            this.cAvarage1 = (note1 * 0.80) + (vb1 * 0.20);
        }

        if ((note2 >= 0 && note2 <= 100) && (vb2 >= 0 && vb2 <= 100)) {
            this.c2.note = note2;
            this.c2.verbalNote = vb2;
            this.cAvarage2 = (note2 * 0.80) + (vb2 * 0.20);
        }

        if ((note3 >= 0 && note3 <= 100) && (vb3 >= 0 && vb3 <= 100)) {
            this.c3.note = note3;
            this.c3.verbalNote = vb3;
            this.cAvarage3 = (note3 * 0.80) + (vb3 * 0.20);
        }
    }

    void isPass() {
        System.out.println("===================");
        System.out.println("Öğrencinin Adı : " + this.name);
        this.avarage = (this.cAvarage1 + this.cAvarage2 + this.cAvarage3) / 3;
        if (this.avarage >= 55) {
            System.out.println("Sınıfı geçtiniz ! ");
        } else {
            System.out.println("Sınıfta kaldınız ! ");
        }

        printNote();
    }

    void printNote() {
        System.out.println(this.c1.name + " Sınav notu (%80) :" + this.c1.note);
        System.out.println(this.c1.name + " Sözlü notu (%20) :" + this.c1.verbalNote);
        System.out.println(this.c1.name + " Dersi ortalaması : " + this.cAvarage1);

        System.out.println(this.c2.name + " Sınav notu (%80) :" + this.c2.note);
        System.out.println(this.c2.name + " Sözlü notu (%20) :" + this.c2.verbalNote);
        System.out.println(this.c2.name + " Dersi ortalaması : " + this.cAvarage2);

        System.out.println(this.c3.name + " Sınav notu (%80) :" + this.c3.note);
        System.out.println(this.c3.name + " Sözlü notu (%20) :" + this.c3.verbalNote);
        System.out.println(this.c3.name + " Dersi ortalaması : " + this.cAvarage3);

        System.out.println("Genel ortalamanız : " + this.avarage);
    }
}
