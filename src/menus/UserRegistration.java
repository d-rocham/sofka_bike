package menus;

import datastructures.Users;

import java.util.Arrays;

public class UserRegistration{
    MenuStep requestID = new MenuStep("Insert your ID");
    MenuStep requestName = new MenuStep("What's your name?");
    MenuStep requestAge = new MenuStep("What's your age?");

    PickOptionMenu selectUserType = new PickOptionMenu(Arrays.asList("Student", "Professor"), "Choose user type:");


    public void menuAction(Users sessionUsers) {
        String selectedUserType = selectUserType.userSelectsValue();

        String newUserID = requestID.gatherStepData();

        String newUserName = requestName.gatherStepData();

        int newUserAge = 0;

        while (newUserAge < 18) {
            newUserAge = Integer.parseInt(requestAge.gatherStepData());
        }

        sessionUsers.addUser(selectedUserType, newUserID, newUserName, newUserAge);
    }
}
