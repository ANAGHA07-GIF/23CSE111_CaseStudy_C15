package SmartParkingSystem;

import java.util.ArrayList;
import java.util.List;

public class Driver extends User {
    private String vehicleNumber;

    public Driver(int userID, String name, String phoneNumber, String vehicleNumber) {
        super(userID, name, phoneNumber);
        this.vehicleNumber = vehicleNumber;
    }

    public List<ParkingSlot> searchSlot(ParkingLot lot) {
        List<ParkingSlot> slots = lot.getAvailableSlots();
        System.out.println("Available slots: " + slots.size());
        return slots;
    }

    public Reservation reserveSlot(ParkingSlot slot) {
        if (slot.reserveSlot()) {
            Reservation reservation = new Reservation(this, slot);
            reservation.createReservation();
            System.out.println("Reservation successful.");
            return reservation;
        } else {
            System.out.println("Slot already occupied.");
            return null;
        }
    }

   
    public void makePayment(Payment payment) {
        if (payment.processPayment()) {
            payment.generateReceipt();
        } else {
            System.out.println("Payment failed.");
        }
    }

    public void viewHistory() {
        System.out.println("Displaying booking history...");
    }
}



