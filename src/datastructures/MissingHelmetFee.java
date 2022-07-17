package datastructures;

public class MissingHelmetFee extends Debt {
    String debtDescription;
    int baseAmount;

    int totalAmount;

    public MissingHelmetFee() {
        this.debtDescription = "Helmet not returned.";
        this.baseAmount = 5;
        this.totalAmount = this.baseAmount;
    }
}
