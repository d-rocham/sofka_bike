package menus;

import java.util.List;

public class TicketHistory extends PickOptionMenu{
    public TicketHistory(List<String> menuOptions, String menuTitle) {
        super(menuOptions, menuTitle);
    }

    @Override
    public void activateMenu() {
        System.out.println("I'm complying, stop nagging me LINTER!");

    }
}
