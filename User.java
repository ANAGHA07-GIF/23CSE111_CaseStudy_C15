package implementation;

public abstract class User {
	protected int userID;
    protected String name;
    protected String phoneNumber;

    public User(int userID, String name, String phoneNumber) {
        this.userID = userID;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public boolean login(String email, String password) {
        if (email != null && password != null) {
            System.out.println(name + " logged in successfully.");
            return true;
        }
        System.out.println("Login failed.");
        return false;
    }

    public void logout() {
        System.out.println(name + " logged out.");
    }
}

