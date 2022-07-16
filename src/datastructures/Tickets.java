package datastructures;

import java.util.ArrayList;
import java.util.List;

public class Tickets {
    List<Ticket> ticketList;

    public Tickets() {
        this.ticketList = new ArrayList<>();
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
