package datastructures;

import java.util.List;

public class Bicycles {
    List<Bicycle> bicyclesList;

    public void addBicycle(String bicycleEntry) {
        String[] extractedData = bicycleEntry.split(";", 0);

        Bicycle newBicycle = new Bicycle(extractedData[0], extractedData[1], extractedData[2], extractedData[3]);

        bicyclesList.add(newBicycle);
    }
}
