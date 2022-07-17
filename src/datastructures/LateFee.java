package datastructures;

public class LateFee extends Debt{
    String debtDescription = "Late return.";
    int baseAmount = 3;

    // Late free receives Ticket open time, a Date when the user was supposed to return it and actual late devolution Date
    // It should ONLY compute the difference between expected devolution and actual devolution
    // Do its math and return
    // TODO: implement method to check total amount
}
