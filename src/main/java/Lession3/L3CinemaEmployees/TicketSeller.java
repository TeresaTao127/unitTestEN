package Lession3.L3CinemaEmployees;

public class TicketSeller extends Employee {
    public TicketSeller(String name, int employmentYear) {
        super(name, employmentYear);
    }

    @Override
    public int getTotalMonthlySalary() {
        return basicSalary;
    }
}
