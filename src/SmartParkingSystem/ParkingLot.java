package SmartParkingSystem;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

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

        // ===== WRITE LOT DETAILS TO FILE =====
        try {

            FileWriter writer =new FileWriter("E:/parkinglot.txt", true);
            writer.write("===== Parking Lot Details =====\n");
            writer.write("Lot ID: " + lotID + "\n");
            writer.write("Location: " + location + "\n");
            writer.write("Total Slots: " + totalSlots + "\n");
            writer.write("------------------------------\n");
            writer.close();
        } catch (IOException e) {
        	System.out.println("Error writing parking lot to file.");
        }
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
        List<ParkingSlot> availableList =
                new ArrayList<>();
        for (ParkingSlot slot : slots) {
        	if ("available".equalsIgnoreCase(
                    slot.getStatus())) {

                availableList.add(slot);
            }
        }

        return availableList;
    }

    public void displayLot() {

        // ===== READ FROM FILE =====
        try {

            BufferedReader reader =
                    new BufferedReader(
                            new FileReader("E:/parkinglot.txt")
                    );

            String line;

            while ((line = reader.readLine()) != null) {

                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {

            System.out.println(
                    "Error reading parking lot file."
            );
        }
    }
}
