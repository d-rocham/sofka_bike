package menus;


import datastructures.Ticket;
import datastructures.Tickets;

import java.util.Arrays;

public class TicketHistory  {
    PickOptionMenu selectDisplayMethod = new PickOptionMenu(Arrays.asList("Show all", "Search by Code", "Filter by status"), "How do you want to see the tickets?");
    MenuStep requestedTicketCode = new MenuStep("Ticket code:");
    PickOptionMenu selectedTicketStatus = new PickOptionMenu(Arrays.asList("Active", "Closed"), "Select the status you want to filter by:");

    public void displayTickets(Tickets sessionTickets) {
        int selectedDisplay = selectDisplayMethod.userSelectsKey();

        if (selectedDisplay == 1) {
            sessionTickets.displayTickets();
            return;
        }

        if (selectedDisplay == 2) {
            String targetCode = requestedTicketCode.gatherStepData();
            if (!sessionTickets.checkTicketExists(targetCode)) {
                System.out.println("Requested ticket doesn't exist.");
                return;
            }
            System.out.println("Code    |UserID    |Amount ($)    |Status    ");
            sessionTickets.retrieveTicket(targetCode).renderTicketSummary();
            return;
        }

        if (selectedDisplay == 3) {
            int selectedFilter = selectedTicketStatus.userSelectsKey();

            if (selectedFilter == 1) {
                // DISPLAY ACTIVE TICKETS, return
            }

            // DISPLAY INACTIVE TICKETS;
        }

    }


}
