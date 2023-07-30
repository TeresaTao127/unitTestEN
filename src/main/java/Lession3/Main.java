package Lession3;

public class Main {
    public static void main(String[] args) {
        Seat seat1 = new Seat(2, 5);

        System.out.println("seat Number: " + seat1.getSeatNumber());
        System.out.println("row Number: " + seat1.getRowNumber());


        System.out.println("Is occupied? " + seat1.isOccupied());

        if (seat1.isOccupied()) {
            System.out.println("The seat is occupied");
        } else {
            System.out.println("The seat is available");
        }

        Movie movie1 = new Movie("The Lord of the Rings", "Peter Jackson", 201, 2003);
        System.out.println("Title: " + movie1.getTitle());
        System.out.println("Director: " + movie1.getDirector());
        System.out.println("Duration of minutes: " + movie1.getDurationMinutes());
        System.out.println("Year of production: " + movie1.getYearOfProduction());

        System.out.println(movie1);


        Employee employee1 = new Employee("John", 2017);
        manager manager1 = new manager("Sam", 2008);
        TicketSeller ticketSeller1 = new TicketSeller("Selina", 2015);

        System.out.println("the name of employee: " + employee1.getName());
        System.out.println("The amount of basic salary: " + employee1.getBasicSalary());
        System.out.println("The employment year: " + employee1.getEmploymentYear());
        System.out.println("The total monthly salary: " + employee1.getTotalMonthlySalary());


        System.out.println("the name of manager: " + manager1.getName());
        System.out.println("The amount of basic salary: " + manager1.getBasicSalary());
        System.out.println("The employment year: " + manager1.getEmploymentYear());
        System.out.println("The total monthly salary: " + manager1.getTotalMonthlySalary());


        System.out.println("the name of ticketSeller: " + ticketSeller1.getName());
        System.out.println("The amount of basic salary: " + ticketSeller1.getBasicSalary());
        System.out.println("The employment year: " + ticketSeller1.getEmploymentYear());
        System.out.println("The total monthly salary: " + ticketSeller1.getTotalMonthlySalary());
    }


}
