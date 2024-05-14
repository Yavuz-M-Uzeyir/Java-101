package patikaProjeler.oop.maasHesabi;

public class Employee {

    String name;
    int salary;
    int workHours;
    int bonusWhours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }

    double bonus() {
        double shiftHours;
        if (this.workHours > 40) {
            shiftHours = this.workHours - 40;
            return shiftHours * 30;
        }
        return 0;
    }

    double raiseSalary() {
        if (2021 - this.hireYear < 10) {
            return (this.salary * 0.05);
        } else if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20) {
            return (this.salary * 0.10);
        } else {
            return (this.salary * 0.15);
        }
    }

    void toStrng() {

        System.out.println("Adı : " + this.name + "\n"
                + "Maaşı : " + this.salary + "\n"
                + "Çalışma Saati : " + this.workHours + "\n"
                + "Başlangıç Yılı : " + this.hireYear + "\n"
                + "Vergi : " + tax() + "\n"
                + "Bonus : " + bonus() + "\n"
                + "Maaş Artışı : " + raiseSalary() + "\n"
                + "Vergi ve Bonuslar ile birlikte maaş : " + ((this.salary) + (bonus() - tax())) + "\n"
                + "Toplam Maaş : " + (this.salary + (bonus() - tax()) + (raiseSalary())));
    }
}
