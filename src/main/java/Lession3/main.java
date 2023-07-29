package Lession3;

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

    }
}
