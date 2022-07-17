package datastructures;

import java.util.ArrayList;
import java.util.List;

public class Tickets {
    List<Ticket> ticketList;

    public Tickets() {
        this.ticketList = new ArrayList<>();
    }

    public void addTicket(String ticketUserID, String ticketbicycleID) {
        ticketList.add(new Ticket(ticketList.size(), ticketUserID, ticketbicycleID));
    }
    public boolean searchForDebt()  {
        for (Ticket ticket :ticketList) {
            if (ticket.ticketDebt > 0){
                return true;
            }
        }
        return false;
    }
}
