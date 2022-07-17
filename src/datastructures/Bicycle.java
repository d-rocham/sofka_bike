package datastructures;

import java.util.HashMap;
import java.util.Map;

public class Bicycle {
    String bicycleCode;
    String bicycleColor;

    boolean bicycleStatus;
    String bicycleType;

    private HashMap<String, String> bicycleProperties = new HashMap<>();

    public void setBicycleStatus(String bicycleStatus) {
        this.bicycleStatus = Boolean.parseBoolean(bicycleStatus);
    }

    protected Bicycle(String bicycleCode, String bicycleType, String bicycleColor, String bicycleStatus) {
        this.bicycleCode = bicycleCode;
        this.bicycleColor = bicycleColor;
        setBicycleStatus(bicycleStatus);
        this.bicycleType = bicycleType;

        bicycleProperties.put("Code", this.bicycleCode);
        bicycleProperties.put("Type", this.bicycleType);
        bicycleProperties.put("Color", this.bicycleColor);
    }

    protected void printBicycle() {
        for (Map.Entry<String, String> entry: bicycleProperties.entrySet()) {
            System.out.format("%s: %s %n", entry.getKey(), entry.getValue());
        }
    }
}
