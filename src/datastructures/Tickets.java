package datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tickets {
    List<Ticket> ticketList;

    public Tickets() {
        this.ticketList = new ArrayList<>();
    }

    public Ticket addTicket(String ticketUserID, String ticketbicycleID) {
        Ticket newTicket = new Ticket(ticketList.size(), ticketUserID, ticketbicycleID);
        ticketList.add(newTicket);

        newTicket.renderTicket();

        return newTicket;
    }

    public boolean checkTicketExists(String targetTicketCode) {
        List<String> ticketCodes = ticketList.stream().map(ticket -> ticket.ticketCode).toList();

        return ticketCodes.contains(targetTicketCode);
    }

    public void addExistingTicket(Ticket existingTicket) {
        ticketList.add(existingTicket);
    }

    public void updateTicket(String ticketCode, boolean newHelmetStatus, boolean newBicycleStatus) {
        Ticket ticketToUpdate = retrieveTicket(ticketCode);
        ticketToUpdate.gotHelmet = newHelmetStatus;
        ticketToUpdate.bicycleCondition = newBicycleStatus;

        ticketToUpdate.setTicketDebts();

        ticketToUpdate.renderTicket();
    }

    protected Ticket retrieveTicket(String targetTicketCode){
        List<Ticket> foundTicket = ticketList.stream().filter(ticket -> Objects.equals(ticket.ticketCode, targetTicketCode)).toList();

        return foundTicket.get(0);

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
