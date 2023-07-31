package L4BillCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillValueAndServiceChargeTest {

    @Test
    void getBillValueAndServiceCharge() {
        BillValueAndServiceCharge billValueAndServiceCharge1=new BillValueAndServiceCharge(100,10);

        double expectedResult=110;
        double result= billValueAndServiceCharge1.getBillValueAndServiceCharge();

        Assertions.assertEquals(expectedResult, result);
    }
}