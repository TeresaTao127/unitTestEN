package Lession3;

public class Manager extends Employee {

    int monthlyBonus;
    public Manager(String name, int employmentYear) {
        super(name, employmentYear);
        this.basicSalary=5000;
        this.monthlyBonus=500;
    }


    @Override
    public int getTotalMonthlySalary() {
        return basicSalary+monthlyBonus;
    }


}
