package datastructures;

public class DamagedBicycle extends Debt {
    String debtDescription;
    int baseAmount;

    int totalAmount;

    public DamagedBicycle() {
        this.debtDescription = "Damaged bicycle.";
        this.baseAmount = 5;
        this.totalAmount = this.baseAmount;
    }
}
