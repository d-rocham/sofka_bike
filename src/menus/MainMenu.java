package menus;

import java.util.List;

public class MainMenu extends PickOptionMenu{
    public MainMenu(List<String> menuOptions, String menuTitle) {
        super(menuOptions, menuTitle);
    }

    protected int menuAction() {
        return 0;
    }
}
