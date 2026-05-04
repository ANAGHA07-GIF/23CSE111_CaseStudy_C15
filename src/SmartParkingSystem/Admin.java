package SmartParkingSystem;

public class Admin extends User {
    private int adminID;
    private String email;
    private String password;

    
    public Admin(int userID, String name, String phoneNumber,
                 int adminID, String email, String password) {
        super(userID, name, phoneNumber);
        this.adminID = adminID;
        this.email = email;
        this.password = password;
    }


    public void manageSlots() {
        System.out.println("Managing parking slots.");
    }

    public void updatePricing(double price) {
        System.out.println("Pricing updated to: " + price);
    }

    public void monitorParking() {
        System.out.println("Monitoring parking.");
    }

    public String generateReports() {
        return "Parking report generated.";
    }
}
