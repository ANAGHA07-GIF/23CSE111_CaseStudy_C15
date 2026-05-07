package SmartParkingSystem;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Admin extends User {
	private int adminID;
    private String email;
    private String password;
    private double parkingPrice;

    public Admin(String userID,String name,String phoneNumber,int adminID,String email,String password) {
    	super(userID, name, phoneNumber);
    	this.adminID = adminID;
        this.email = email;
        this.password = password;
        this.parkingPrice = 50;
    }
    // ================= MANAGE SLOTS =================
    public void manageSlots(ParkingLot lot) {
    	System.out.println("\n===== SLOT DETAILS =====");
    	List<ParkingSlot> slots =lot.getAvailableSlots();
    	if (slots.isEmpty()) {
    		System.out.println("No available slots.");
    	} else {
    		for (ParkingSlot slot : slots) {
    			slot.displaySlot();
    			System.out.println();
            }
        }
    }

    // ================= UPDATE PRICING =================
    public void updatePricing(double price) {
    	parkingPrice = price;
    	System.out.println("Parking price updated to Rs. "+ parkingPrice);
    }

    // ================= MONITOR PARKING =================
    public void monitorParking(ParkingLot lot) {
    	System.out.println("\n===== PARKING MONITORING =====");
    	if (lot.checkAvailability()) {
    		System.out.println("Parking slots are available.");
    	} else {
    		System.out.println("Parking lot is full.");
        }
    }

    // ================= GENERATE REPORT =================
    public String generateReports(ParkingLot lot) {

        return "\n===== PARKING REPORT ====="
                + "\nAdmin ID: " + adminID
                + "\nParking Location Monitored Successfully.";
    }
}