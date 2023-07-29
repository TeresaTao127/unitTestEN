package Lession3;

public class Seat {
    private final int seatNumber;
    private final int rowNumber;

    private boolean occupied;

    public Seat(int seatNumber, int rowNumber) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
        this.occupied=false;

    }

    public int getSeatNumber(){
        return seatNumber;

    }

    public int getRowNumber(){
        return rowNumber;
    }

    public boolean isOccupied() {
        return occupied;
    }



}
