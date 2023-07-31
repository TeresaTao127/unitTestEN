package L4BillCalculator;

public class BillDiscountAndServiceCharge extends BillCalculator {


    double discount;

    public BillDiscountAndServiceCharge(double billValue, float serviceCharge, double discount) {
        this.billValue=billValue;
        this.serviceCharge=serviceCharge;
        this.discount = discount;
    }

    @Override
    public double getBillValueAndServiceCharge() {
        return 0;
    }

    @Override
    public double getBillDiscountAndServiceCharge() {
        double billValueAfterDiscount = billValue - (billValue * discount / 100);
        return billValueAfterDiscount + (billValueAfterDiscount * serviceCharge / 100);
    }

    @Override
    public double getTakeAwayCharge() {
        return 0;
    }
}



