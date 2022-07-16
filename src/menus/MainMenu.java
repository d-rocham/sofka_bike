package menus;

import datastructures.Users;

import java.util.List;

public class MainMenu extends PickOptionMenu {
    public MainMenu(List<String> menuOptions, String menuTitle) {
        super(menuOptions, menuTitle);
    }

    public void activateMenu(Users sessionUsers) {
        int userAction = userSelectsKey();

        if (userAction == 1) {
            System.out.println("lol");
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

    }

}
