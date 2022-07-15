package menus;

import java.util.List;

public abstract class PickOptionMenu {
    private List<String> menuOptions;
    private String menuTitle;

    protected PickOptionMenu(List<String> menuOptions, String menuTitle) {
        this.menuOptions = menuOptions;
        this.menuTitle = menuTitle;
    }

    protected abstract int menuAction();
}
