package menus;

import datastructures.*;

import java.util.Arrays;

public class BicycleBorrower {
    MenuStep requestID = new MenuStep("Insert your ID");

    PickOptionMenu selectBicycleType = new PickOptionMenu(Arrays.asList("Mountain", "Road"), "Choose bicycle type:");

    public void borrowBicycle(Users sessionUsers, Bicycles sessionBicycles, Tickets sessionTickets) {
        String requestedUserID = requestID.gatherStepData();
        if (!sessionUsers.checkUserExists(requestedUserID)){
            System.out.println("Requested user doesn't exist");
            return;
        }

        User targetUser = sessionUsers.retrieveUser(requestedUserID);

        if (targetUser.checkUserHasDebt()) {
            System.out.println("User has debt. Pay the debt prior to requesting another bike");
            return;
        }

        String requestedBicycleType = selectBicycleType.userSelectsValue();

        if (sessionBicycles.checkIsEmpty(requestedBicycleType)) {
            System.out.format("There are no %s bicycles available%n", requestedBicycleType);
            return;
        }

        Bicycle assignedBicycle = sessionBicycles.assignBicycle(requestedBicycleType);

        Ticket newTicket = sessionTickets.addTicket(requestedUserID, assignedBicycle.bicycleCode);

        targetUser.userTickets.addExistingTicket(newTicket);

    }
}
