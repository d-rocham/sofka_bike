package menus;

import java.util.Arrays;

public class BicycleBorrower {
    MenuStep requestID = new MenuStep("Insert your ID");

    PickOptionMenu selectUserType = new PickOptionMenu(Arrays.asList("Mountain", "Road"), "Choose bicycle type:");

}
