package Lession3;

public class main {
    public static void main(String[] args) {
        seat seat1= new seat(2,5);

        System.out.println("seat Number: " + seat1.getSeatNumber());
        System.out.println("row Number: " + seat1.getRowNumber());
        System.out.println("Is occupied? " + seat1.isOccupied());

//        seat1.occupy();
//        System.out.println("Is occupied? "+seat1.isOccupied());
//
//        seat1.release();
//        System.out.println("Is occupied? "+seat1.isOccupied());
    }
}
