package SmartParkingSystem;

public class ParkingSlot {
	private int slotID;
    private int slotNumber;
    private int floorNumber;
    private String status; 

    public ParkingSlot(int slotID, int slotNumber, int floorNumber) {
        this.slotID = slotID;
        this.slotNumber = slotNumber;
        this.floorNumber = floorNumber;
        this.status = "Available";
    }
    public String getStatus() {
    	return status;
    }

    public boolean reserveSlot() {
        if (status.equals("Available")) {
            status = "Occupied";
            updateStatus(status);
            System.out.println("Slot reserved successfully.");
            return true;  
        } else {
            System.out.println("Slot is already occupied.");
            return false;  
        }
    }

    public void releaseSlot() {
        status = "Available";
        updateStatus(status);
        System.out.println("Slot released successfully.");
    }

    public void updateStatus(String newStatus) {
        status = newStatus;
        System.out.println("Slot status updated to: " + status);
    }

    public void displaySlot() {
        System.out.println("Slot ID: " + slotID);
        System.out.println("Slot Number: " + slotNumber);
        System.out.println("Floor Number: " + floorNumber);
        System.out.println("Status: " + status);
    }
}



