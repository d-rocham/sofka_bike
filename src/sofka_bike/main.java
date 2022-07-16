package sofka_bike;

import datastructures.Bicycles;
import datastructures.Tickets;
import datastructures.Users;
import menus.MainMenu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class main {

    public static void main(String[] args) throws IOException {
        /* INITIALIZE DATA STRUCTURES */

        Bicycles sessionBicycles = new Bicycles();

        File bicyclesDB = new File("../bicycles.txt");

        BufferedReader reader = new BufferedReader(new FileReader(bicyclesDB));

        String currentLine;

        while ((currentLine = reader.readLine()) != null) {
            sessionBicycles.addBicycle(currentLine);
        }

        Users sessionUsers = new Users();

        Tickets sessionTickets = new Tickets();

        MainMenu sessionMainMenu = new MainMenu([""]);




    }



}
