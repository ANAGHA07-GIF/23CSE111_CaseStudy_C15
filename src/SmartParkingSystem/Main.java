package SmartParkingSystem;
import java.util.List;
public class Main {

	public static void main(String[] args) {

		 ParkingLot lot = new ParkingLot(1, "City Center", 5);

		   
	        ParkingSlot s1 = new ParkingSlot(101, 1, 1);
	        ParkingSlot s2 = new ParkingSlot(102, 2, 1);
	        ParkingSlot s3 = new ParkingSlot(103, 3, 1);

	        lot.addSlot(s1);
	        lot.addSlot(s2);
	        lot.addSlot(s3);

	    
	        Driver driver = new Driver(1, "Alice", "9876543210", "KL01AB1234");

	        driver.login("user@gmail.com", "1234");

	    
	        List<ParkingSlot> availableSlots = driver.searchSlot(lot);

	 
	        Reservation reservation = null;

	        if (!availableSlots.isEmpty()) {
	            ParkingSlot chosenSlot = availableSlots.get(0);
	            reservation = driver.reserveSlot(chosenSlot);
	        }

	       
	        if (reservation != null) {
	            Payment payment = new Payment(1, 0, "UPI");

	            payment.calculateFee(2); 

	            driver.makePayment(payment);
	        }

	       
	        if (reservation != null) {
	            System.out.println("Current Status: " + reservation.checkStatus());

	            reservation.cancelReservation();

	            System.out.println("Updated Status: " + reservation.checkStatus());
	        }

	       
	        Admin admin = new Admin(2, "AdminUser", "9999999999", 1001, "admin@gmail.com", "admin123");

	        admin.manageSlots();
	        admin.updatePricing(100);
	        admin.monitorParking();

	        System.out.println(admin.generateReports());

	      
	        lot.displayLot();

	        
	        driver.logout();
	    }
	

}


