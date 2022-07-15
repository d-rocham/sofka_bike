package datastructures;

import java.util.ArrayList;
import java.util.List;

public class Users {
    List<User> users;

    public Users(List<User> users) {
        this.users = new ArrayList<>();
    }

    public void addUser(){
        // TODO: implement
        return;
    }

    public int getUsersLength(){
        return users.size();
    }

    public boolean checkUserExists(String targetUserID) {
        // TODO: fix the bug below
        List<String> userIDS = users.forEach(user -> user.userID);
        return userIDS.contains(targetUserID);
    }
}
