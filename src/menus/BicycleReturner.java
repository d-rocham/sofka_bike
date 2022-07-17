package menus;

import java.util.Arrays;

public class BicycleReturner {
    MenuStep requestTicket = new MenuStep("What's your ticket nuumber?");

    PickOptionMenu selectHelmetOption = new PickOptionMenu(Arrays.asList("Yes", "No"), "Did you bring the bike's helmet?");

    PickOptionMenu selectBikeHelmet = new PickOptionMenu(Arrays.asList("Yes", "No"), "Did you take care of the bicycle?");

    public void returnBicycle()
}
