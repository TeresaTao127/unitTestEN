package L4BillCalculator;

public class BillCalculatorImplements extends BillCalculator {


    double discount;

    int takeAwayCharge;

    public BillCalculatorImplements(double billValue, float serviceCharge, double discount, int takeAwayCharge) {
        this.billValue = billValue;
        this.serviceCharge = serviceCharge;
        this.discount = discount;
        this.takeAwayCharge = takeAwayCharge;
    }


    @Override
    public double getBillDiscountAndServiceCharge() {
        double billValueAfterDiscount = billValue - (billValue * discount / 100);
        return billValueAfterDiscount + (billValueAfterDiscount * serviceCharge / 100);
    }

    @Override
    public double getBillValueAndServiceCharge() {
        return billValue + (billValue * serviceCharge / 100);
    }

    @Override
    public double getTakeAwayCharge() {
        return billValue + (billValue * serviceCharge / 100) + takeAwayCharge;
    }
}



