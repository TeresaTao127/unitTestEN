package L4BillCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillDiscountAndServiceChargeTest {

    @Test
    void getBillDiscountAndServiceCharge() {
        BillDiscountAndServiceCharge billDiscountAndServiceCharge1=new BillDiscountAndServiceCharge(100,10,10);

        double expectedResult=99;
        double result= billDiscountAndServiceCharge1.getBillDiscountAndServiceCharge();

        Assertions.assertEquals(expectedResult, result);
    }
}