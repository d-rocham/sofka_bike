package menus.DataStructures;

import java.sql.Time;
import java.util.Date;

public class Ticket {
    String ticketCode;
    Date ticketDate;
    Time ticketTime;
    boolean gotHelmet;
    String ticketUserID;
    int ticketDebt;

    protected Ticket(String ticketCode, Date ticketDate, Time ticketTime, boolean gotHelmet, String ticketUserID, int ticketDebt) {
        this.ticketCode = ticketCode;
        this.ticketDate = ticketDate;
        this.ticketTime = ticketTime;
        this.gotHelmet = gotHelmet;
        this.ticketUserID = ticketUserID;
        this.ticketDebt = ticketDebt;
    }
}
