package SmartParkingSystem;

import java.io.FileWriter;
import java.io.IOException;
public class Payment {
	private int paymentID;
    private double amount;
    private String paymentMethod;

    public Payment(int paymentID, double amount, String paymentMethod) {
        this.paymentID = paymentID;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public double calculateFee(int hours) {
        double ratePerHour = 50; 
        amount = hours * ratePerHour;
        return amount;
    }

    public boolean processPayment() {
        if (amount <= 0) {
            System.out.println("Invalid payment amount.");
            return false;
        }

        System.out.println("Processing payment of Rs. " + amount + " using " + paymentMethod + "...");
        boolean paymentSuccess = true;

        if (paymentSuccess) {
            System.out.println("Payment successful.");
            return true;
        } else {
            System.out.println("Payment failed.");
            return false;
        }
    }

    public void generateReceipt() {
        try {
            FileWriter writer = new FileWriter("receipt.txt", true);

            writer.write("------ Payment Receipt ------\n");
            writer.write("Payment ID: " + paymentID + "\n");
            writer.write("Amount: Rs." + amount + "\n");
            writer.write("Method: " + paymentMethod + "\n");
            writer.write("-----------------------------\n\n");

            writer.close();

            System.out.println("Receipt generated and saved to file.");

        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

}

