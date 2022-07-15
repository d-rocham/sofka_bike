package datastructures;

public class Bicycle {
    String bicycleCode;
    String bicycleColor;

    boolean bicycleStatus;
    String bicycleType;

    public void setBicycleStatus(String bicycleStatus) {

        this.bicycleStatus = Boolean.parseBoolean(bicycleStatus);
    }

    protected Bicycle(String bicycleCode, String bicycleColor, boolean bicycleStatus, String bicycleType) {
        this.bicycleCode = bicycleCode;
        this.bicycleColor = bicycleColor;
        this.bicycleStatus = bicycleStatus;
        this.bicycleType = bicycleType;
    }
}
