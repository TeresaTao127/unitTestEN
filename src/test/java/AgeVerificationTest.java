import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeVerificationTest {

    @Test
    void isAgeGreaterThanOrEqualTo18() {


            assertTrue(AgeVerification.isAgeGreaterThanOrEqualTo18(18));

        }

}