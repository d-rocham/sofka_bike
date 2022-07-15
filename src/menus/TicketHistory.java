package menus;

import java.util.List;

public class TicketHistory extends PickOptionMenu{
    public TicketHistory(List<String> menuOptions, String menuTitle) {
        super(menuOptions, menuTitle);
    }

    @Override
    protected int menuAction() {
        return 0;
    }
}
