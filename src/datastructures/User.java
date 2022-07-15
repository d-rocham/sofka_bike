package datastructures;

public class User {
    String userType;
    String userID;
    String userName;
    int userAge;

    protected User(String userType, String userID, String userName, int userAGe) {
        this.userType = userType;
        this.userID = userID;
        this.userName = userName;
        this.userAge = userAGe;
    }
}
