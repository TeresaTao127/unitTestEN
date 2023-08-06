package L4BillCalculator;

import java.security.PublicKey;

public abstract class BillCalculator {
    double billValue;
    float serviceCharge;

    public abstract double getBillValueAndServiceCharge();

    public abstract double getBillDiscountAndServiceCharge();

    public abstract double getTakeAwayCharge();

}
