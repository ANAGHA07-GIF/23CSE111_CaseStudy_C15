package SmartParkingSystem;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter Parking Lot ID: ");
        int lotID = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Location: ");
        String location = sc.nextLine();

        System.out.print("Enter Total Slots: ");
        int totalSlots = sc.nextInt();

        ParkingLot lot = new ParkingLot(lotID, location, totalSlots);

        System.out.print("Enter number of slots to add: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for slot " + (i + 1));

            System.out.print("Slot ID: ");
            int slotID = sc.nextInt();

            System.out.print("Slot Number: ");
            int slotNumber = sc.nextInt();

            System.out.print("Floor Number: ");
            int floorNumber = sc.nextInt();

            ParkingSlot slot = new ParkingSlot(slotID, slotNumber, floorNumber);
            lot.addSlot(slot);
        }

        sc.nextLine(); 

        // Driver details
        System.out.println("\nEnter Driver Details:");

        System.out.print("User ID: ");
        int userID = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Phone Number: ");
        String phone = sc.nextLine();

        System.out.print("Vehicle Number: ");
        String vehicle = sc.nextLine();

        Driver driver = new Driver(userID, name, phone, vehicle);

        // Login
        System.out.print("\nEnter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        driver.login(email, password);

        // Search slots
        List<ParkingSlot> availableSlots = driver.searchSlot(lot);

        Reservation reservation = null;

        if (!availableSlots.isEmpty()) {
            ParkingSlot chosenSlot = availableSlots.get(0);
            reservation = driver.reserveSlot(chosenSlot);
        }

        // Payment
        if (reservation != null) {

            System.out.print("\nEnter Payment Method: ");
            String method = sc.nextLine();

            System.out.print("Enter number of hours: ");
            int hours = sc.nextInt();

            Payment payment = new Payment(1, 0, method);

            payment.calculateFee(hours);
            driver.makePayment(payment);
        }

        // Reservation status
        if (reservation != null) {
            System.out.println("Current Status: " + reservation.checkStatus());

            reservation.cancelReservation();

            System.out.println("Updated Status: " + reservation.checkStatus());
        }

        // Admin
        Admin admin = new Admin(2, "AdminUser", "9999999999",
                1001, "admin@gmail.com", "admin123");

        admin.manageSlots();
        admin.updatePricing(100);
        admin.monitorParking();

        System.out.println(admin.generateReports());

        // Display lot
        lot.displayLot();

        driver.logout();

        sc.close();
    }
}


