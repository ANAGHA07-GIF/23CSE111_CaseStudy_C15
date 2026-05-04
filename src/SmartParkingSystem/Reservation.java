package SmartParkingSystem;

import java.time.LocalDateTime;
public class Reservation {

    private int reservationID;
    private LocalDateTime reservationTime;
    private LocalDateTime expirationTime;
    private String status;

    private User user;              
    private ParkingSlot slot;       

    private static int counter = 1;
    public Reservation( User user, ParkingSlot slot) {
        this.reservationID = counter++;
        this.user = user;
        this.slot = slot;
        this.status = "PENDING";   
    }


	    public void createReservation() {
	        this.status = "ACTIVE";
	        this.reservationTime = LocalDateTime.now();
	        this.expirationTime = reservationTime.plusHours(2);
	        System.out.println("Reservation created successfully.");
	    }

	 
	    public void cancelReservation() {
	        this.status = "CANCELLED";
	        slot.releaseSlot();   
	        System.out.println("Reservation cancelled.");
	    }

	    public String checkStatus() {
	        return this.status;
	    }

	   
	    public void displayReservation() {
	        System.out.println("Reservation ID: " + reservationID);
	        System.out.println("Status: " + status);
	        System.out.println("Reservation Time: " + reservationTime);
	        System.out.println("Expiration Time: " + expirationTime);
	    }
}



