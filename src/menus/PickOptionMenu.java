package menus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PickOptionMenu {

    protected HashMap<Integer, String> menuOptions = new HashMap<>();
    protected String menuTitle;

    public PickOptionMenu(List<String> menuOptions, String menuTitle) {
        setMenuOptions(menuOptions);
        this.menuTitle = menuTitle;
    }

    private void setMenuOptions(List<String> menuOptionsList) {
        for (int idx = 0; idx < menuOptionsList.size(); idx++) {
            int key = idx + 1;
            this.menuOptions.put(key, menuOptionsList.get(idx));
        }
    }

    protected void renderMenu(){
        System.out.println(menuTitle);

        for (Map.Entry<Integer, String> entry: menuOptions.entrySet()) {
            System.out.format("%s: %s \n", entry.getKey(), entry.getValue());
        }
    }

    protected boolean checkMenuOptions(int target){
        return menuOptions.containsKey(target);
    }

    private int processUserChoice() {
        Scanner mainMenuScanner = new Scanner(System.in);

        int userChoice = 0;

        while (!checkMenuOptions(userChoice)) {
            renderMenu();
            userChoice = Integer.parseInt(mainMenuScanner.nextLine());
        }

        return userChoice;
    }

    public int userSelectsKey() {
        return processUserChoice();
    }

     public String userSelectsValue() {
        int userChoice = processUserChoice();

        return menuOptions.get(userChoice);
    }
}
