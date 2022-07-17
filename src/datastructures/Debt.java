package datastructures;

public class Debt {
    String debtDescription;
    int baseAmount;

    int totalAmount;

    public Debt(String debtDescription, int baseAmount, int totalAmount) {
        this.debtDescription = debtDescription;
        this.baseAmount = baseAmount;
        this.totalAmount = totalAmount;
    }
}
