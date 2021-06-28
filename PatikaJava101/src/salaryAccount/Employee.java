package salaryAccount;

public class Employee {
	String name;
    int salary, workHours, hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    
    double tax() {
        double taxAmount = 0.0;
        if (this.salary < 1000) {
            System.out.println("Vergi uygulanmayacak.");
        } else {
            taxAmount = this.salary * 0.03;
        }
        return taxAmount;
    }
    
    int bonus() {
        int bonus = this.workHours * 30;
        return bonus;
    }
    
    double raiseSalary() {
        int year = 2021 - this.hireYear;
        double zam = 0.0;
        if (year < 10) {
            zam = this.salary * 0.05;
        } else if (year > 9 && year < 20) {
            zam = this.salary * 0.10;
        } else if (year > 19) {
            zam = this.salary * 0.15;
        }
        return zam;
    }
    
    double generalSalary() {
        double maas = this.salary - tax() + bonus();
        return maas;
    }

    double totalSalary() {
        double toplam = this.salary + raiseSalary();
        return toplam;
    }
    
    public String toString() {
    	return "Adý: " + this.name + "\nMaaþý: " + this.salary + "\nÇalýþma Saati: " + this.workHours
                + "\nBaþlangýç Yýlý: " + this.hireYear + "\nVergi: " + this.tax() + "\nBonus: " + this.bonus()
                + "\nMaaþ Artýþý: " + this.raiseSalary() + "\nVergi ve Bonuslar ile birlikte maaþ: " + generalSalary()
                + "\nToplam Maaþ: " + totalSalary();
    }

}
