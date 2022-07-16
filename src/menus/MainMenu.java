package menus;

import java.util.List;

public class MainMenu extends PickOptionMenu{
    public MainMenu(List<String> menuOptions, String menuTitle) {
        super(menuOptions, menuTitle);
    }

    public void activateMenu() {
        int userAction = interactWithUser();

        if (userAction == 1) {
            System.out.println("Register user");
        }

        if (userAction == 2) {
            System.out.println("Borrow bicycle");
        }

        if (userAction == 3 ){
            System.out.println("Return bicycle");
        }

        if (userAction == 4) {
            System.out.println("Ticket history");
        }

        return;
    }

}
