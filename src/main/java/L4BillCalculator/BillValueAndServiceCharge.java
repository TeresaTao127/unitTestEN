package L4BillCalculator;

public class BillValueAndServiceCharge extends BillCalculator {

    public BillValueAndServiceCharge(double billValue, float serviceCharge) {
        this.billValue = billValue;
        this.serviceCharge = serviceCharge;
    }

    @Override
    public double getBillValueAndServiceCharge() {
        return billValue + (billValue * serviceCharge / 100);
    }

    @Override
    public double getBillDiscountAndServiceCharge() {
        return 0;
    }

    @Override
    public double getTakeAwayCharge() {
        return 0;
    }


}