package Lession3.L3CinemaEmployees;

public abstract class Employee {

    String name;
    int basicSalary;

    int employmentYear;


    public Employee(String name, int employmentYear) {
        this.name = name;
        this.basicSalary = 3000;
        this.employmentYear = employmentYear;
    }

    public String getName() {
        return name;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public final int getEmploymentYear() {
        int currentYear = 2023;
        return currentYear - employmentYear;
    }

    public abstract int getTotalMonthlySalary();

}
