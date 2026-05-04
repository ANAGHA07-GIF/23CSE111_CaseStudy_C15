package SmartParkingSystem;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private int lotID;
    private String location;
    private int totalSlots;
    private int availableSlots;
    private List<ParkingSlot> slots;

    
    public ParkingLot(int lotID, String location, int totalSlots) {
        this.lotID = lotID;
        this.location = location;
        this.totalSlots = totalSlots;
        this.availableSlots = totalSlots;
        this.slots = new ArrayList<>();
    }

    
    public void addSlot(ParkingSlot slot) {
        slots.add(slot);
        updateSlotCount(); 
    }

    public boolean checkAvailability() {
        updateSlotCount(); 
        return availableSlots > 0;
    }

    
    public void updateSlotCount() {
        int count = 0;

        for (ParkingSlot slot : slots) {
            if ("available".equalsIgnoreCase(slot.getStatus())) {
                count++;
            }
        }
        availableSlots = count;
    }
  
    public List<ParkingSlot> getAvailableSlots() {
        updateSlotCount(); 

        List<ParkingSlot> availableList = new ArrayList<>();

        for (ParkingSlot slot : slots) {
            if ("available".equalsIgnoreCase(slot.getStatus())) {
                availableList.add(slot);
            }
        }
        return availableList;
    }

    public void displayLot() {
        updateSlotCount(); 
        System.out.println("Lot ID: " + lotID);
        System.out.println("Location: " + location);
        System.out.println("Total Slots: " + totalSlots);
        System.out.println("Available Slots: " + availableSlots);
    }
}
