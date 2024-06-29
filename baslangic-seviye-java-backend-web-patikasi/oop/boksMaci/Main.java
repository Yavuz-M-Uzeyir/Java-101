package patikaProjeler.oop.boksMaci;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Ahmet", 15, 100, 100, 15);
        Fighter f2 = new Fighter("Mehmet", 20, 80, 90, 30);

        Match m1 = new Match(f1, f2, 90, 100);
        m1.run();
    }
}
