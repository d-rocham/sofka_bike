package datastructures;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ticket {
    int ticketNumber;
    String ticketCode;
    Date ticketDate;
    Time ticketOpenHour;
    Time ticketCloseHour;
    boolean gotHelmet;
    boolean bicycleCondition;
    String ticketUserID;
    String ticketBicycleCode;
    List<Date> ticketDebts;

    int ticketDebt;

    public Ticket(int ticketNumber, String ticketCode, Date ticketDate, Time ticketOpenHour, boolean gotHelmet, boolean bicycleCondition, String ticketUserID, String ticketBicycleCode, List<Date> ticketDebts, int ticketDebt) {
        this.ticketNumber = ticketNumber;
        this.ticketCode = generateTicketCode();
        this.ticketDate = generateTicketDate();
        this.ticketOpenHour = generateTicketHour();
        this.gotHelmet = true;
        this.bicycleCondition = true;
        this.ticketUserID = ticketUserID;
        this.ticketBicycleCode = ticketBicycleCode;
        this.ticketDebts = new ArrayList<>();
        this.ticketDebt = 0;
    }

    private String generateTicketCode() {

    }

    private Date generateTicketDate() {

    }

    private Time generateTicketHour() {

    }
}
