package L4BillCalculator;

public class TakeAwayCharge extends BillCalculator{
    int takeAwayCharge;

    public TakeAwayCharge(double billValue, float serviceCharge,int takeAwayCharge) {
        this.billValue=billValue;
        this.serviceCharge=serviceCharge;
        this.takeAwayCharge = takeAwayCharge;
    }

    @Override
    public double getBillValueAndServiceCharge() {
        return 0;
    }

    @Override
    public double getBillDiscountAndServiceCharge() {
        return 0;
    }

    @Override
    public double getTakeAwayCharge() {
        return billValue + (billValue * serviceCharge / 100)+takeAwayCharge;
    }
}
