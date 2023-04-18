/*
RewardValue class must satisfy the following requirements:
    RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
    RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
    RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
    RewardValue must convert from miles to cash at a rate of 0.0035.
 */

public class RewardValue {
    private double cashVal;
    private int milesVal;
    private static final double milesToCashRate = 0.0035;

    public RewardValue(double cashVal) {
        this.cashVal = cashVal;
        this.milesVal = (int) (cashVal / milesToCashRate);
    }


    public RewardValue(int milesVal) {
        this.milesVal = milesVal;
        this.cashVal = milesVal * milesToCashRate;
    }


    public double getCashValue() {
        return cashVal;
    }

    public double getMilesValue() {
        return milesVal;
    }
}
