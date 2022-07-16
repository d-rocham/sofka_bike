package menus;

import java.util.ArrayList;
import java.util.List;

public abstract class StepsMenu {
    private List<MenuStep> menuSteps = new ArrayList<>();

    protected StepsMenu(List<MenuStep> menuSteps) {
        this.menuSteps = menuSteps;
    }

    protected abstract void menuAction();
}
