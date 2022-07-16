package datastructures;

import java.util.List;

public class Users {
    List<User> users;

    public void addUser(String userType, String userID, String userName, int userAge){
        User newUser = new User(userType, userID, userName, userAge);
        users.add(newUser);
    }

    public int getUsersLength(){
        return users.size();
    }

    public boolean checkUserExists(String targetUserID) {
        // TODO: fix the bug below
        List<String> userIDS = users.stream().map(user -> user.userID).toList();
        return userIDS.contains(targetUserID);
    }
}
