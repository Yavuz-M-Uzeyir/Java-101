package patikaProjeler.oop.ogrenciBilgiSistemi;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double verbalNote;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(prefix)) {
            this.teacher = teacher;
        } else {
            System.out.print("Öğretmen ve ders bölümleri uyuşmuyor! ");
        }
    }

    void printTeacher() {
        this.teacher.print();
    }
}
