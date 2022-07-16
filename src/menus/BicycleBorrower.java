package menus;

import datastructures.Bicycles;
import datastructures.Users;

import java.util.Arrays;

public class BicycleBorrower {
    MenuStep requestID = new MenuStep("Insert your ID");

    PickOptionMenu selectUserType = new PickOptionMenu(Arrays.asList("Mountain", "Road"), "Choose bicycle type:");

    public void borrowBicycle(Users sessionUsers, Bicycles sessionBicycles) {


    }
}
