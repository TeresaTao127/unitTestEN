package L4BillCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillCalculatorImplementsTest {

    @Test
    void getBillDiscountAndServiceCharge() {
       BillCalculatorImplements BillDiscountAndServiceCharge=new BillCalculatorImplements(100,10,10,5);
       int expectedResult=99;
       double result=BillDiscountAndServiceCharge.getBillDiscountAndServiceCharge();
       assertEquals(expectedResult, result);
    }

    @Test
    void getBillValueAndServiceCharge() {
        BillCalculatorImplements  BillValueAndServiceCharge=new BillCalculatorImplements(100,10,10,5);
        int expectedResult1=110;
        double result1=BillValueAndServiceCharge.getBillValueAndServiceCharge();
        assertEquals(expectedResult1,result1);
    }

    @Test
    void getTakeAwayCharge() {
        BillCalculatorImplements TakeAwayCharge=new BillCalculatorImplements(100,10,10,5);
        int expectedResult2=115;
        double result2= TakeAwayCharge.getTakeAwayCharge();
        assertEquals(expectedResult2,result2);
    }
}