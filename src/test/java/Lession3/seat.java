package Lession3;

public class seat {
    private final int seatNumber;
    private final int rowNumber;

    private boolean occupied;

    public seat(int seatNumber, int rowNumber) {
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

    public void occupy(){
        this.occupied=true;
    }

    public void release(){
        this.occupied=false;
    }
}
