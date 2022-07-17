package menus;

import datastructures.Tickets;

import java.util.Arrays;

public class BicycleReturner {
    MenuStep requestTicket = new MenuStep("What's your ticket nuumber?");

    PickOptionMenu selectHelmetOption = new PickOptionMenu(Arrays.asList("Yes", "No"), "Did you bring the bike's helmet?");

    PickOptionMenu selectBikeStatus = new PickOptionMenu(Arrays.asList("Yes", "No"), "Did you take care of the bicycle?");

    public void returnBicycle(Tickets sessionTickets) {
        String userTicket = requestTicket.gatherStepData();

        if (!sessionTickets.checkTicketExists(userTicket)){
            System.out.println("Submitted ticket does not exist.");
            return;
        }

        String helmetStatus = selectHelmetOption.userSelectsValue();
        String bikeStatus = selectBikeStatus.userSelectsValue();

    }
}
