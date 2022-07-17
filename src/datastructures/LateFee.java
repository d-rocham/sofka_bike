package datastructures;

public class LateFee extends Debt{
    String debtDescription = "Late return.";
    int baseAmount = 3;

    public int calculateDebt(long timeLate) {
        return (int) ((timeLate / 30) * 3);
    }
}
