package datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bicycles {
    List<Bicycle> bicyclesList;

    public Bicycles() {
        this.bicyclesList = new ArrayList<>();
    }

    public void addBicycle(String bicycleEntry) {
        String[] extractedData = bicycleEntry.split(";", 0);

        Bicycle newBicycle = new Bicycle(extractedData[0], extractedData[1], extractedData[2], extractedData[3]);

        bicyclesList.add(newBicycle);
    }

    private List<Bicycle> filterByType(String requestedType) {
        return bicyclesList.stream().filter(bicycle -> Objects.equals(bicycle.bicycleType, requestedType)).toList();
    }

    public boolean checkTypeAvailability(String requestedType) {
        return filterByType(requestedType).size() > 0;
    }

    public Bicycle assignBicycle(String requestedType) {
        Bicycle assignedBicycle = bicyclesList.stream().filter(bicycle -> bicycle.bicycleType == requestedType).toList().get(0);
        assignedBicycle.bicycleStatus = true;

        renderBicycleAssignement(assignedBicycle);

        return assignedBicycle;
    }

    public void renderBicycleAssignement(Bicycle assignedBicycle) {
        System.out.println("Bicycle chosen!");
        assignedBicycle.printBicycle();
    }

}
