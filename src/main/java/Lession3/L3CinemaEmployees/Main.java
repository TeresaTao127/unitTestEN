package Lession3.L3CinemaEmployees;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", 2017) {
            @Override
            public int getTotalMonthlySalary() {
                return basicSalary;
            }
        };

        System.out.println("the name of employee: " + employee1.getName());
        System.out.println("The amount of basic salary: " + employee1.getBasicSalary());
        System.out.println("The employment year: " + employee1.getEmploymentYear());
        System.out.println("The total monthly salary: " + employee1.getTotalMonthlySalary());



        Manager manager1 = new Manager("Sam", 2008);
        System.out.println("the name of manager: " + manager1.getName());
        System.out.println("The amount of basic salary: " + manager1.getBasicSalary());
        System.out.println("The employment year: " + manager1.getEmploymentYear());
        System.out.println("The total monthly salary: " + manager1.getTotalMonthlySalary());



        TicketSeller ticketSeller1 = new TicketSeller("Selina", 2015);
        System.out.println("the name of ticketSeller: " + ticketSeller1.getName());
        System.out.println("The amount of basic salary: " + ticketSeller1.getBasicSalary());
        System.out.println("The employment year: " + ticketSeller1.getEmploymentYear());
        System.out.println("The total monthly salary: " + ticketSeller1.getTotalMonthlySalary());
    }

}
