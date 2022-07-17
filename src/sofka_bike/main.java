package sofka_bike;

import datastructures.Bicycles;
import datastructures.Tickets;
import datastructures.Users;
import menus.*;

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

        PickOptionMenu mainMenu = new PickOptionMenu(Arrays.asList("Register user", "Borrow Bicycle", "Return Bicycle", "Pay Debt","Tickets History", "Exit"), "SOFKA BIKE");

        UserRegistration userRegistrationMenu = new UserRegistration();

        BicycleBorrower borrowBicycleMenu = new BicycleBorrower();

        BicycleReturner returnBicycleMenu = new BicycleReturner();

        TicketPayment payTicketMenu = new TicketPayment();

        TicketHistory ticketHistoryMenu = new TicketHistory();

        /* RENDER */
        int requestedSubmenu = 0;

        while (requestedSubmenu != 6 ) {
            requestedSubmenu = mainMenu.userSelectsKey();

            if (requestedSubmenu == 1) {
                userRegistrationMenu.registerNewUser(sessionUsers);
            }

            if (requestedSubmenu == 2) {
                borrowBicycleMenu.borrowBicycle(sessionUsers, sessionBicycles, sessionTickets);
            }

            if (requestedSubmenu == 3) {
                returnBicycleMenu.returnBicycle(sessionTickets, sessionBicycles);
            }

            if (requestedSubmenu == 4) {
                payTicketMenu.payTicket(sessionTickets, sessionUsers);

            }

            if (requestedSubmenu == 5) {
                ticketHistoryMenu.displayTickets(sessionTickets);

            }

        }
        System.out.println("Bye");
    }

}
