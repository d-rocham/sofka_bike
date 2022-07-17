package datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        List<String> userIDS = users.stream().map(user -> user.userID).toList();
        return userIDS.contains(targetUserID);
    }

    public User retrieveUser(String targetUserID) {
        List<User> foundUser = users.stream().filter(user -> Objects.equals(user.userID, targetUserID)).toList();

        return foundUser.get(0);
    }

    public void addUser(String userType, String userID, String userName, int userAge){
        User newUser = new User(userType, userID, userName, userAge);
        users.add(newUser);
        printNewUser(newUser);
    }
}
