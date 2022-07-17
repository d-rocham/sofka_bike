package datastructures;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Objects;

public class User {
    String userType;
    String userID;
    String userName;
    int userAge;

    private HashMap<String, String> userProperties = new HashMap<>();

    public Tickets userTickets;

    protected User(String userType, String govID, String userName, int userAge) {
        this.userType = userType;
        this.userID = createUserID(govID);
        this.userName = userName;
        this.userAge = userAge;
        this.userTickets = new Tickets();

        userProperties.put("Type", this.userType);
        userProperties.put("ID", this.userID);
        userProperties.put("Name", this.userName);
        userProperties.put("Age", Integer.toString(this.userAge));
    }

    public boolean checkUserHasDebt() {
        return userTickets.searchForDebt();
    }

    protected void printUser() {
        for (Entry<String, String> entry: userProperties.entrySet()) {
            System.out.format("%s: %s %n", entry.getKey(), entry.getValue());
        }
    }

    private String createUserID(String govID) {
        return String.format("%s-%s", Objects.equals(this.userType, "Professor") ? "P" : "S", govID);
    }

}
