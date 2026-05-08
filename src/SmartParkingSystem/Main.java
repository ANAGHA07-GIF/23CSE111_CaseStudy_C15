package SmartParkingSystem;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ParkingLot lot = null;
        Admin admin = null;
        Driver driver = null;
        Reservation reservation = null;

        int mainChoice;
        do {
        	System.out.println("\n===== SMART PARKING MANAGEMENT SYSTEM =====");
            System.out.println("1. Admin");
            System.out.println("2. Driver");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            mainChoice = sc.nextInt();
            sc.nextLine();

            switch (mainChoice) {
            // ================= ADMIN =================
                case 1:
                	if (admin == null) {
                		admin = new Admin("Admin101","AdminUser","9999999999",1001,"admin@gmail.com","admin123");
                    }
                	int adminChoice;
                	do {
                		System.out.println("\n===== ADMIN MENU =====");
                        System.out.println("1. Create Parking Lot");
                        System.out.println("2. Add Parking Slots");
                        System.out.println("3. Manage Slots");
                        System.out.println("4. Update Pricing");
                        System.out.println("5. Monitor Parking");
                        System.out.println("6. Generate Reports");
                        System.out.println("7. Display Parking Lot");
                        System.out.println("8. Back");

                        System.out.print("Enter choice: ");
                        adminChoice = sc.nextInt();
                        sc.nextLine();

                        switch (adminChoice) {
                        // Create Parking Lot
                            case 1:
                            	System.out.print("Enter Parking Lot ID: ");
                                int lotID = sc.nextInt();
                                sc.nextLine();

                                System.out.print("Enter Location: ");
                                String location = sc.nextLine();

                                System.out.print("Enter Total Slots: ");
                                int totalSlots = sc.nextInt();

                                lot = new ParkingLot(lotID,location,totalSlots);

                                System.out.println(
                                        "Parking Lot created successfully."
                                );

                                break;

                            // Add Slots
                            case 2:

                                if (lot == null) {
                                	System.out.println("Create Parking Lot first."
                                    );

                                } else {

                                    System.out.print("Enter number of slots to add: ");

                                    int n = sc.nextInt();

                                    for (int i = 0; i < n; i++) {
                                    	System.out.println("\nEnter details for Slot " + (i + 1));
                                    	
                                    	System.out.print("Slot ID: ");
                                        int slotID = sc.nextInt();

                                        System.out.print("Slot Number: ");
                                        int slotNumber = sc.nextInt();

                                        System.out.print("Floor Number: ");
                                        int floorNumber = sc.nextInt();

                                        ParkingSlot slot =new ParkingSlot(slotID,slotNumber,floorNumber);

                                        lot.addSlot(slot);
                                    }

                                    System.out.println("Slots added successfully.");
                                    }

                                break;

                            // Manage Slots
                            case 3:
                            	admin.manageSlots(lot);;
                            	break;

                            // Update Pricing
                            case 4:
                            	System.out.print("Enter new parking price: ");
                            	double price = sc.nextDouble();
                            	admin.updatePricing(price);
                            	break;

                            // Monitor Parking
                            case 5:
                            	admin.monitorParking(lot);
                            	break;

                            // Generate Reports
                            case 6:
                            	System.out.println(admin.generateReports(lot));
                            	break;

                            // Display Parking Lot
                            case 7:
                            	if (lot != null) {
                            		lot.displayLot();

                                } else {
                                	System.out.println("Parking Lot not created.");
                                }
                            	break;

                            case 8:
                            	System.out.println("Returning to Main Menu...");
                            	break;
                            	default:
                            		System.out.println("Invalid Choice!");
                            		}
                	} while (adminChoice != 8);
                	break;

                // ================= DRIVER =================
                case 2:
                	if (lot == null) {
                		System.out.println("Parking Lot not created yet.");
                		break;
                    }
                	// Driver Registration
                	if (driver == null) {

                        System.out.println("\n===== DRIVER REGISTRATION =====");

                        System.out.print("Enter User ID: ");
                        String userID = sc.nextLine();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Phone Number: ");
                        String phone = sc.nextLine();

                        System.out.print("Enter Vehicle Number: ");
                        String vehicle = sc.nextLine();

                        driver = new Driver(userID,name,phone,vehicle);
                    }

                    int driverChoice;

                    do {

                        System.out.println("\n===== DRIVER MENU =====");
                        System.out.println("1. Login");
                        System.out.println("2. Search Slots");
                        System.out.println("3. Reserve Slot");
                        System.out.println("4. Make Payment");
                        System.out.println("5. Check Reservation Status");
                        System.out.println("6. Cancel Reservation");
                        System.out.println("7. View History");
                        System.out.println("8. Logout");
                        System.out.println("9. Back");

                        System.out.print("Enter choice: ");
                        driverChoice = sc.nextInt();
                        sc.nextLine();

                        switch (driverChoice) {
                        // Login
                            case 1:
                            	System.out.print("Enter Email: ");
                                String email = sc.nextLine();

                                System.out.print("Enter Password: ");
                                String password = sc.nextLine();

                                driver.login(email, password);

                                break;
                            // Search Slots
                            case 2:
                            	List<ParkingSlot> availableSlots =driver.searchSlot(lot);
                            	if (availableSlots.isEmpty()) {
                            		System.out.println("No slots available.");
                                } else {
                                	System.out.println( "\nAvailable Slots:");
                                	for (int i = 0;i < availableSlots.size();i++) {
                                		System.out.println("Slot " + (i + 1));
                                    }
                                }

                                break;

                            // Reserve Slot
                            case 3:
                            	List<ParkingSlot> slots =driver.searchSlot(lot);
                                if (!slots.isEmpty()) {
                                	System.out.println("\nAvailable Slots:");

                                    for (int i = 0;i < slots.size();i++) {
                                    	System.out.println("Slot "+ (i + 1));
                                    }

                                    System.out.print( "Choose slot number: ");
                                    int choice = sc.nextInt();
                                    ParkingSlot chosenSlot =slots.get(choice - 1);

                                    reservation =driver.reserveSlot(chosenSlot);

                                } else {
                                	System.out.println("No slots available.");
                                }

                                break;
                                // Make Payment
                            case 4:

                                if (reservation != null) {
                                	System.out.print( "Enter Payment Method cash or UPI: ");

                                    String method = sc.nextLine();

                                    System.out.print("Enter number of hours: ");

                                    int hours = sc.nextInt();

                                    Payment payment =new Payment(1, 0, method);

                                    payment.calculateFee(hours);

                                    driver.makePayment(payment);

                                } else {

                                    System.out.println( "No reservation found.");
                                }

                                break;

                            // Check Reservation Status
                            case 5:

                                if (reservation != null) {

                                    System.out.println("Reservation Status: "+ reservation.checkStatus());

                                } else {
                                	System.out.println("No reservation found.");
                                }

                                break;

                            // Cancel Reservation
                            case 6:

                                if (reservation != null) {
                                	reservation.cancelReservation();
                                } else {
                                	System.out.println("No reservation to cancel.");
                                }

                                break;

                            // View History
                            case 7:
                            	driver.viewHistory();
                            	break;

                            // Logout
                            case 8:
                            	driver.logout();
                            	break;
                            case 9:
                            	System.out.println("Returning to Main Menu...");
                            	break;
                            default:
                            	System.out.println("Invalid Choice!");
                        }

                    } while (driverChoice != 9);

                    break;

                // ================= EXIT =================
                case 3:
                	System.out.println("Thank you for using Smart Parking System!");
                	break;
                default:
                	System.out.println("Invalid Choice!");
            }

        } while (mainChoice != 3);
        sc.close();
    }
}
