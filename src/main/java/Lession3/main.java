package Lession3;

import java.sql.SQLOutput;

public class main {
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
    }


}
