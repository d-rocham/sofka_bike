package menus;

import java.util.List;

public abstract class StepsMenu {
    private List<String> menuSteps;

    protected StepsMenu(List<String> menuSteps) {
        this.menuSteps = menuSteps;
    }

    protected abstract void menuAction();
}
