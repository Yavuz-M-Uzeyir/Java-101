package patikaProjeler.oop.boksMaci;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name, int damage, int healt, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = healt;
        this.weight = weight;

        if (dodge >= 0 && dodge <= 100) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }
    }

    int hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + "'e " + this.damage + " hasar vurdu.");

        if (foe.isDodge()) {
            System.out.println(foe.name + " saldırıyı blokladı ! ");
            return foe.health;
        }

        if (foe.health - this.damage < 0) {
            return 0;
        }

        return foe.health - this.damage;
    }

    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }

}
