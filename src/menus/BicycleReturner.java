package menus;

import datastructures.Bicycles;
import datastructures.Tickets;

import java.util.Arrays;
import java.util.Objects;

public class BicycleReturner {
    MenuStep requestTicket = new MenuStep("What's your ticket number?");

    PickOptionMenu selectHelmetOption = new PickOptionMenu(Arrays.asList("Yes", "No"), "Did you bring the bike's helmet?");

    PickOptionMenu selectBikeStatus = new PickOptionMenu(Arrays.asList("Yes", "No"), "Did you take care of the bicycle?");

    public void returnBicycle(Tickets sessionTickets, Bicycles sessionBicycles) {
        String userTicketCode = requestTicket.gatherStepData();

        if (!sessionTickets.checkTicketExists(userTicketCode)){
            System.out.println("Submitted ticket does not exist.");
            return;
        }

        String helmetStatus = selectHelmetOption.userSelectsValue();
        String bikeStatus = selectBikeStatus.userSelectsValue();

        String bicycleCode = sessionTickets.retrieveBicycleCode(userTicketCode);

        sessionBicycles.toggleBicycleStatus(bicycleCode);

        sessionTickets.updateTicket(userTicketCode, Objects.equals(helmetStatus, "Yes"), Objects.equals(bikeStatus, "Yes"));

    }
}
