package menus;

import java.util.Scanner;

public class MenuStep {
    String stepTitle;

    protected String gatherStepData() {
        System.out.println(stepTitle);

        Scanner stepScanner = new Scanner(System.in);

        return stepScanner.nextLine();
    }
}
