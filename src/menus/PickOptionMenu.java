package menus;

import java.util.HashMap;
import java.util.List;

public abstract class PickOptionMenu {

    private HashMap<Integer, String> menuOptions;
    private String menuTitle;

    protected PickOptionMenu(List<String> menuOptions, String menuTitle) {
        setMenuOptions(menuOptions);
        this.menuTitle = menuTitle;
    }

    public void setMenuOptions(List<String> menuOptionsList) {
        for (int idx = 0; idx < menuOptionsList.size(); idx++) {
            this.menuOptions.put(idx + 1, menuOptionsList.get(idx));
        }
    }

    protected abstract int menuAction();
}
