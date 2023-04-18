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
        if(cashVal < 0) {
            throw new IllegalArgumentException("cashVal must be non-negative");
        }
        this.cashVal = cashVal;
    }


    public RewardValue(int milesVal) {
        if(milesVal < 0){
            throw new IllegalArgumentException("milesVal must be non-negative");
        }
        this.cashVal = milesVal * milesToCashRate;
    }


    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / milesToCashRate);
    }

    private static double convertToCash(int milesValue) {
        return milesValue * milesToCashRate;
    }

    public double getCashValue() {
        return cashVal;
    }

    public double getMilesValue() {
        return convertToMiles(cashVal);
    }
}
