package datastructures;

public class LateFee extends Debt{
    String debtDescription;
    int baseAmount;
    int totalAmount;

    public LateFee(long timeLate) {
        this.debtDescription = "Late return";
        this.baseAmount = 3;
        this.totalAmount = calculateDebt(timeLate);
    }

    // For demonstration purposes, the function below charges the baseAmount per 2
    // minutes of delay.
    private int calculateDebt(long timeLate) {
        return (int) ((timeLate / 2) * baseAmount);
    }
}
