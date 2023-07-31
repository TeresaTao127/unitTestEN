package L4BillCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class billValueServiceTakeAwayChargeTest {

    @Test
    void getTakeAwayCharge() {
        TakeAwayCharge takeAwayCharge1=new TakeAwayCharge(100,10,5);

        double expectedResult=115;
        double result= takeAwayCharge1.getTakeAwayCharge();

        Assertions.assertEquals(expectedResult, result);

    }
}