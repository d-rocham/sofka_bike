package menus;

import java.util.List;

public class MainMenu extends PickOptionMenu{
    public MainMenu(List<String> menuOptions, String menuTitle) {
        super(menuOptions, menuTitle);
    }

    public int menuAction() {
        renderMenu();
        return 0;
    }
}
