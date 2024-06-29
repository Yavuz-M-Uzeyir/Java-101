package baslangic_seviye_java_backend_web_patikasi.oop.boksMaci;

public class Match {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    int start;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {

        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.start = 50;
    }

    void run() {
        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("================");

                if (firstFighter() == f1) {
                    this.f2.health = this.f1.hit(f2);
                    this.f1.health = this.f2.hit(f1);
                    isWin();
                } else {
                    this.f1.health = this.f2.hit(f1);
                    this.f2.health = this.f1.hit(f2);
                    isWin();
                }
                System.out.println(this.f1.name + " Sağlık " + this.f1.health);
                System.out.println(this.f2.name + " Sağlık " + this.f2.health);
            }
        } else {
            System.out.println("Sporcu sikletleri uyuşmuyor ! ");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight)
                && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0 || this.f1.health < 0) {
            System.out.println(this.f2.name + " Kazandı !");
            return true;
        }
        if (this.f2.health == 0 || this.f2.health < 0) {
            System.out.println(this.f1.name + " Kazandı !");
            return true;
        }
        return false;
    }

    Fighter firstFighter() {
        Fighter first;

        if (chance()) {
            first = f1;
            return first;
        } else {
            first = f2;
            return first;
        }
    }

    boolean chance() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.start;
    }
}
