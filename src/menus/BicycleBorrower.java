package menus;

import datastructures.Bicycles;
import datastructures.User;
import datastructures.Users;

import java.util.Arrays;

public class BicycleBorrower {
    MenuStep requestID = new MenuStep("Insert your ID");

    PickOptionMenu selectBicycleType = new PickOptionMenu(Arrays.asList("Mountain", "Road"), "Choose bicycle type:");

    public void borrowBicycle(Users sessionUsers, Bicycles sessionBicycles) {
        String requestedUserID = requestID.gatherStepData();
        if (!sessionUsers.checkUserExists(requestedUserID)){
            System.out.println("Requested user doesn't exist");
            return;
        }

        User targetUser = sessionUsers.retrieveUser(requestedUserID);

        if (targetUser.checkUserHasDebt()) {
            System.out.println("User has debt. Pay the debt prior to requesting another bike");
        }


        String requestedBicycleType = selectBicycleType.userSelectsValue();
        // Find requested type


    }
}
