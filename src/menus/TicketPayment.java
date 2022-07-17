package menus;

import datastructures.Ticket;
import datastructures.Tickets;
import datastructures.User;
import datastructures.Users;

public class TicketPayment {
    MenuStep requestTicket = new MenuStep("What's your ticket code?");
    MenuStep askPayment = new MenuStep("Insert sum to pay");

    public void payTicket(Tickets sessionTickets, Users sessionUsers) {
        String targetTicket = requestTicket.gatherStepData();

        if (!sessionTickets.checkTicketExists(targetTicket)) {
            System.out.println("Requested ticket doesn't exist");
            return;
        }

        Ticket foundTicket = sessionTickets.retrieveTicket(targetTicket);

        if (foundTicket.ticketDebt <= 0) {
            System.out.println("Requested ticket has no debt.");
            return;
        }

        int collectedPayment = Integer.valueOf(askPayment.gatherStepData());

        if (collectedPayment != foundTicket.ticketDebt) {
            System.out.println("Wrong value");
            return;
        }

        foundTicket.payTicket();

        User userToUpdate = sessionUsers.retrieveUser(foundTicket.ticketUserID);
        userToUpdate.userTickets.retrieveTicket(targetTicket).payTicket();
    }
}
