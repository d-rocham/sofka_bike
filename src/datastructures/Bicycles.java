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


    public boolean checkIsEmpty(String requestedType) {
        return filterByType(requestedType).isEmpty();
    }

    public Bicycle assignBicycle(String requestedType) {
        List<Bicycle> assignedBicycle = bicyclesList.stream().filter(bicycle -> Objects.equals(bicycle.bicycleType, requestedType)).toList();

        assignedBicycle.get(0).bicycleStatus = false;

        renderBicycleAssignement(assignedBicycle.get(0));

        return assignedBicycle.get(0);
    }

    public void renderBicycleAssignement(Bicycle assignedBicycle) {
        System.out.println("Bicycle chosen!");
        assignedBicycle.printBicycle();
    }

    public void toggleBicycleStatus(String bicycleCode) {
        List<Bicycle> foundBike = bicyclesList.stream().filter(bicycle -> Objects.equals(bicycle.bicycleCode, bicycleCode)).toList();

        Bicycle targetBicycle = foundBike.get(0);

        targetBicycle.bicycleStatus = !targetBicycle.bicycleStatus;
    }


}
