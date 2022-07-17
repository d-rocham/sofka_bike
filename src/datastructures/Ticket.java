package datastructures;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ticket {
    int ticketNumber;
    String ticketCode;

    Date ticketOpenDate;
    Date ticketCloseDate;
    boolean gotHelmet;
    boolean bicycleCondition;
    String ticketUserID;
    String ticketBicycleCode;
    List<Date> ticketDebts;

    int ticketDebt;

    public Ticket(int ticketNumber,  String ticketUserID, String ticketBicycleCode) {
        this.ticketNumber = ticketNumber;
        this.ticketCode = generateTicketCode(ticketNumber);
        this.ticketOpenDate = new Date();
        this.gotHelmet = true;
        this.bicycleCondition = true;
        this.ticketUserID = ticketUserID;
        this.ticketBicycleCode = ticketBicycleCode;
        this.ticketDebts = new ArrayList<>();
        this.ticketDebt = 0;
    }

    private String generateTicketCode(int ticketNumber) {
        if (ticketNumber < 10) {
            return String.format("T-%02d", ticketNumber);
        }

        if (ticketNumber < 100) {
            return String.format("T-%01d", ticketNumber);
        }

        return String.format("T-%d", ticketNumber);
    }


    public void renderTicket() {
        // Here is where the date & time should be rendered separately
        // No need for an different property for each
    }
}
