package datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Users {
    List<User> users;

    public void addUser(){
        // TODO: implement
        return;
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
