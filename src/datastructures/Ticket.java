package datastructures;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Ticket {
    int ticketNumber;
    String ticketCode;

    Date ticketOpenDate;
    Date ticketCloseDate;

    boolean ticketStatus;
    boolean gotHelmet;
    boolean bicycleCondition;
    public String ticketUserID;
    String ticketBicycleCode;
    List<Debt> ticketDebts;

    public int ticketDebt;

    HashMap<String, String> printableParameters = new HashMap<>();

    public Ticket(int ticketNumber,  String ticketUserID, String ticketBicycleCode) {
        this.ticketNumber = ticketNumber;
        this.ticketCode = generateTicketCode(ticketNumber);
        this.ticketOpenDate = new Date();
        this.ticketStatus = true;
        this.gotHelmet = true;
        this.bicycleCondition = true;
        this.ticketUserID = ticketUserID;
        this.ticketBicycleCode = ticketBicycleCode;
        this.ticketDebts = new ArrayList<>();
        this.ticketDebt = 0;

        setPrintableProperties();

    }

    public void renderTicket() {
        for (Map.Entry<String, String> entry: printableParameters.entrySet()) {
            System.out.format("%s: %s %n", entry.getKey(), entry.getValue());
        }
    }

    public void payTicket(boolean renderTicket) {
        this.ticketDebt = 0;
        this.ticketDebts = new ArrayList<>();

        setPrintableProperties();
        if (renderTicket) {
            renderTicket();
        }
    }

    protected void setTicketDebts() {
        if (!gotHelmet) {
            Debt missingHelmet = new Debt("Missing helmet", 5, 5);
            this.ticketDebts.add(missingHelmet);
        }

        if (!bicycleCondition) {
            Debt damagedBicycle = new Debt("Damaged bicycle", 5, 5);
            this.ticketDebts.add(damagedBicycle);
        }

        getDateDifference();

        if (!ticketDebts.isEmpty()) {
            this.ticketDebt = 0;
            for (Debt debt: ticketDebts) {
                System.out.println(debt.debtDescription);
                this.ticketDebt += debt.totalAmount;
            }
        }
    }

    protected void closeTicket(boolean newHelmetStatus, boolean newBicycleCondition) {
        this.gotHelmet = newHelmetStatus;
        this.bicycleCondition = newBicycleCondition;
        this.ticketCloseDate = new Date();
        this.ticketStatus = false;

        setTicketDebts();
        setPrintableProperties();
    }

    private void getDateDifference() {

        long diffInMilliseconds = Math.abs(ticketCloseDate.getTime() - ticketOpenDate.getTime());

        long diffInMinutes = TimeUnit.MINUTES.convert(diffInMilliseconds, TimeUnit.MILLISECONDS);

        int debtAmount = (int) (diffInMinutes / 2) * 3;

        // For demonstration purposes, the configuration below is set to create a debt after 2
        // minutes have passed.
        if (diffInMinutes > 2) {
            Debt lateFee = new Debt("Late return", 3, debtAmount);
            ticketDebts.add(lateFee);
        }

    }

    private String generateTicketCode(int ticketNumber) {
        if (ticketNumber < 10) {
            return String.format("T-%02d", ticketNumber);
        }

        if (ticketNumber < 100) {
            return String.format("T-%01d", ticketNumber);
        }

        return String.format("T-%d", ticketNumber);
    }

    private String formatOpenDate(String formatType) {
        String pattern = Objects.equals(formatType, "date") ? "dd-MM-yy" : "kk:mm";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.format(ticketOpenDate);
    }

    private String formatCloseDateTime() {
        if (ticketCloseDate == null) {
            return "Not closed yet.";
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy 'at' kk:mm");

        return dateFormat.format(ticketCloseDate);
    }

    private void setPrintableProperties() {
        printableParameters.put("Ticket Code", this.ticketCode);
        printableParameters.put("Bicycle", this.ticketBicycleCode);
        printableParameters.put("User", this.ticketUserID);
        printableParameters.put("Open date", formatOpenDate("date"));
        printableParameters.put("Open hour", formatOpenDate("time"));
        printableParameters.put("Closing date and hour", formatCloseDateTime());
        printableParameters.put("Helmet", Boolean.toString(this.gotHelmet));
        printableParameters.put("Condition", this.bicycleCondition ? "Good" : "Damaged");
        printableParameters.put("Status", this.ticketStatus ? "Open" : "Closed");
        printableParameters.put("Debt", String.valueOf(this.ticketDebt));
    }


}
