import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        RewardValue reward1 = new RewardValue(350.0); // cash value of 350.0 should convert to 100,000 miles
        assertEquals(100000, reward1.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        RewardValue reward = new RewardValue(100000); // miles value of 100,000 should convert to 350.0 cash
        assertEquals(350.0, reward.getCashValue(), 0.001);
    }

    @Test
    public void testZeroCashValue() {
        RewardValue reward = new RewardValue(0.0);
        assertEquals(0.0, reward.getCashValue(), 0.001);
        assertEquals(0, reward.getMilesValue());
    }

    @Test
    public void testZeroMilesValue() {
        RewardValue reward = new RewardValue(0);
        assertEquals(0.0, reward.getCashValue(), 0.001);
        assertEquals(0, reward.getMilesValue());
    }

    @Test
    public void testNegativeCashValue() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            RewardValue reward = new RewardValue(-100.0);
        });


    }

    @Test
    public void testNegativeMilesValue() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            RewardValue reward = new RewardValue(-100);
        });


    }

}
