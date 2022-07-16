package menus;

import java.util.HashMap;
import java.util.List;

public abstract class PickOptionMenu {

    protected HashMap<Integer, String> menuOptions = new HashMap<>();
    protected String menuTitle;

    protected PickOptionMenu(List<String> menuOptions, String menuTitle) {
        setMenuOptions(menuOptions);
        this.menuTitle = menuTitle;
    }

    private void setMenuOptions(List<String> menuOptionsList) {
        for (int idx = 0; idx < menuOptionsList.size(); idx++) {
            this.menuOptions.put(idx + 1, String.format("%d. %s", idx, menuOptionsList.get(idx)));
        }
    }

    protected void renderMenu(){
        System.out.println(menuTitle);
        for (String value : menuOptions.values()
             ) {
            System.out.println(value);
        }
    }

    protected abstract int menuAction();
}
