package menus;


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
        }

        if (selectedDisplay == 2) {
            String targetCode = requestedTicketCode.gatherStepData();
            // SEARCH FOR REQUESTED TICKET.
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
