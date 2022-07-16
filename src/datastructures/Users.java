package datastructures;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private List<User> users;

    public Users() {
        this.users = new ArrayList<>();
    }

    private void printNewUser(User user) {
        System.out.println("Registration completed!");
        user.printUser();

    }

    public int getUsersLength(){
        return users.size();
    }

    public boolean checkUserExists(String targetUserID) {
        // TODO: fix the bug below
        List<String> userIDS = users.stream().map(user -> user.userID).toList();
        return userIDS.contains(targetUserID);
    }

    public void addUser(String userType, String userID, String userName, int userAge){
        User newUser = new User(userType, userID, userName, userAge);
        users.add(newUser);
        printNewUser(newUser);
    }
}
