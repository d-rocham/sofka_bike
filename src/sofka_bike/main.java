package sofka_bike;

import datastructures.Bicycles;
import datastructures.Tickets;
import datastructures.Users;
import menus.PickOptionMenu;
import menus.UserRegistration;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class main {

    public static void main(String[] args) throws IOException {
        /* INITIALIZE DATA STRUCTURES */

        Bicycles sessionBicycles = new Bicycles();

        File bicyclesDB = new File("./bicycles.txt");

        BufferedReader reader = new BufferedReader(new FileReader(bicyclesDB));

        String currentLine;

        while ((currentLine = reader.readLine()) != null) {
            sessionBicycles.addBicycle(currentLine);
        }

        Users sessionUsers = new Users();

        Tickets sessionTickets = new Tickets();

        /* INITIALIZE MENUS */

        PickOptionMenu mainMenu = new PickOptionMenu(Arrays.asList("Register user", "Borrow Bicycle", "Return Bicycle", "Tickets History", "Exit"), "SOFKA BIKE");

        UserRegistration userRegistrationMenu = new UserRegistration();

        /* RENDER */
        int requestedSubmenu = mainMenu.userSelectsKey();

        if (requestedSubmenu == 1) {
            userRegistrationMenu.menuAction(sessionUsers);
        }
    }

}
