package Lession3;

public class manager extends Employee {

    int monthlyBonus;

    public manager(String name, int employmentYear) {
        super(name, employmentYear);
        this.basicSalary = 5000;
        this.monthlyBonus = 500;
    }


    @Override
    public int getTotalMonthlySalary() {
        return basicSalary + monthlyBonus;
    }


}
