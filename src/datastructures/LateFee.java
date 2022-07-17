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

    private int calculateDebt(long timeLate) {
        return (int) ((timeLate / 30) * baseAmount);
    }
}
