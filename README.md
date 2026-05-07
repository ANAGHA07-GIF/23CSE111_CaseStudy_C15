Smart Parking Management System 
________________________________________
Team Members (with roles)
•	ANAGHA SD (AM.SC.U4CSE25202) –User, Driver & Admin classes + documentation
•	ANANTH KRISHNA CS (AM.SC.U4CSE25203) – ParkingLot class+ documentation 
•	DEVINANDANA P (AM.SC.U4CSE25214) – ParkingSlot class & Payment classes + documentation 
•	PRANAV V N G (AM.SC.U4CSE25242) – Reservation class  + documentation
________________________________________
Problem Description
Finding parking in busy areas is a major challenge. Drivers often waste time searching for available parking slots, leading to traffic congestion, fuel wastage, and frustration.
This project aims to solve this problem by:
•	Managing parking slots efficiently
•	Tracking available and occupied spaces
•	Allowing users to park and vacate slots easily
•	Providing a structured system to handle parking operations
________________________________________
How to Run the Code
Prerequisites:
•	Java JDK installed
•	Any IDE (E.g., IntelliJ IDEA / Eclipse / VS Code)
Steps:
1.	Download or clone the project
2.	Open the project in your IDE
3.	Navigate to the main class (e.g., Main.java)
4.	Compile and run:
javac Main.java
java Main
________________________________________
===== SMART PARKING MANAGEMENT SYSTEM =====
1. Admin
2. Driver
3. Exit
Enter your choice: 1

===== ADMIN MENU =====
1. Create Parking Lot
2. Add Parking Slots
3. Manage Slots
4. Update Pricing
5. Monitor Parking
6. Generate Reports
7. Display Parking Lot
8. Back
Enter choice: 1
Enter Parking Lot ID: 102
Enter Location: Airport
Enter Total Slots: 4
Parking Lot created successfully.

===== ADMIN MENU =====
1. Create Parking Lot
2. Add Parking Slots
3. Manage Slots
4. Update Pricing
5. Monitor Parking
6. Generate Reports
7. Display Parking Lot
8. Back
Enter choice: 2
Enter number of slots to add: 3

Enter details for Slot 1
Slot ID: 103
Slot Number: 1
Floor Number: 3

Enter details for Slot 2
Slot ID: 101
Slot Number: 1
Floor Number: 1

Enter details for Slot 3
Slot ID: 102
Slot Number: 1
Floor Number: 1
Slots added successfully.

===== ADMIN MENU =====
1. Create Parking Lot
2. Add Parking Slots
3. Manage Slots
4. Update Pricing
5. Monitor Parking
6. Generate Reports
7. Display Parking Lot
8. Back
Enter choice: 3

===== SLOT DETAILS =====
Slot ID: 103
Slot Number: 1
Floor Number: 3
Status: Available

Slot ID: 101
Slot Number: 1
Floor Number: 1
Status: Available

Slot ID: 102
Slot Number: 1
Floor Number: 1
Status: Available


===== ADMIN MENU =====
1. Create Parking Lot
2. Add Parking Slots
3. Manage Slots
4. Update Pricing
5. Monitor Parking
6. Generate Reports
7. Display Parking Lot
8. Back
Enter choice: 4
Enter new parking price: 100
Parking price updated to Rs. 100.0

===== ADMIN MENU =====
1. Create Parking Lot
2. Add Parking Slots
3. Manage Slots
4. Update Pricing
5. Monitor Parking
6. Generate Reports
7. Display Parking Lot
8. Back
Enter choice: 5

===== PARKING MONITORING =====
Parking slots are available.

===== ADMIN MENU =====
1. Create Parking Lot
2. Add Parking Slots
3. Manage Slots
4. Update Pricing
5. Monitor Parking
6. Generate Reports
7. Display Parking Lot
8. Back
Enter choice: 6

===== PARKING REPORT =====
Admin ID: 1001
Parking Location Monitored Successfully.

===== ADMIN MENU =====
1. Create Parking Lot
2. Add Parking Slots
3. Manage Slots
4. Update Pricing
5. Monitor Parking
6. Generate Reports
7. Display Parking Lot
8. Back
Enter choice: 7

===== Parking Lot Details =====
Lot ID: 101
Location: Lulu mall
Total Slots: 3
===== Parking Lot Details =====
Lot ID: 102
Location: Airport
Total Slots: 4
------------------------------

===== ADMIN MENU =====
1. Create Parking Lot
2. Add Parking Slots
3. Manage Slots
4. Update Pricing
5. Monitor Parking
6. Generate Reports
7. Display Parking Lot
8. Back
Enter choice: 8
Returning to Main Menu...

===== SMART PARKING MANAGEMENT SYSTEM =====
1. Admin
2. Driver
3. Exit
Enter your choice: 2

===== DRIVER REGISTRATION =====
Enter User ID: Alice101

Enter Name: Alice
Enter Phone Number: 9446601831
Enter Vehicle Number: KL02BA2525

===== DRIVER MENU =====
1. Login
2. Search Slots
3. Reserve Slot
4. Make Payment
5. Check Reservation Status
6. Cancel Reservation
7. View History
8. Logout
9. Back
Enter choice: 1
Enter Email: alice@gmail.com
Enter Password: 1234
Alice logged in successfully.

===== DRIVER MENU =====
1. Login
2. Search Slots
3. Reserve Slot
4. Make Payment
5. Check Reservation Status
6. Cancel Reservation
7. View History
8. Logout
9. Back
Enter choice: 3
Available slots: 3

Available Slots:
Slot 1
Slot 2
Slot 3
Choose slot number: 1
Slot reserved successfully.
Reservation created successfully.
Reservation successful.

===== DRIVER MENU =====
1. Login
2. Search Slots
3. Reserve Slot
4. Make Payment
5. Check Reservation Status
6. Cancel Reservation
7. View History
8. Logout
9. Back
Enter choice: 4
Enter Payment Method: Upi
Enter number of hours: 4
Processing payment of Rs. 200.0 using Upi...
Payment successful.
Receipt generated and saved to file.

===== DRIVER MENU =====
1. Login
2. Search Slots
3. Reserve Slot
4. Make Payment
5. Check Reservation Status
6. Cancel Reservation
7. View History
8. Logout
9. Back
Enter choice: 5
Reservation Status: ACTIVE

===== DRIVER MENU =====
1. Login
2. Search Slots
3. Reserve Slot
4. Make Payment
5. Check Reservation Status
6. Cancel Reservation
7. View History
8. Logout
9. Back
Enter choice: 6
Slot released successfully.
Reservation cancelled.

===== DRIVER MENU =====
1. Login
2. Search Slots
3. Reserve Slot
4. Make Payment
5. Check Reservation Status
6. Cancel Reservation
7. View History
8. Logout
9. Back
Enter choice: 5
Reservation Status: CANCELLED

===== DRIVER MENU =====
1. Login
2. Search Slots
3. Reserve Slot
4. Make Payment
5. Check Reservation Status
6. Cancel Reservation
7. View History
8. Logout
9. Back
Enter choice: 7
Displaying booking history...

===== DRIVER MENU =====
1. Login
2. Search Slots
3. Reserve Slot
4. Make Payment
5. Check Reservation Status
6. Cancel Reservation
7. View History
8. Logout
9. Back
Enter choice: 8
Alice logged out.

===== DRIVER MENU =====
1. Login
2. Search Slots
3. Reserve Slot
4. Make Payment
5. Check Reservation Status
6. Cancel Reservation
7. View History
8. Logout
9. Back
Enter choice: 9
Returning to Main Menu...

===== SMART PARKING MANAGEMENT SYSTEM =====
1. Admin
2. Driver
3. Exit
Enter your choice: 3
Thank you for using Smart Parking System!


________________________________________
Tools / Technologies Used
•	Programming Language: Java
•	Concepts Used:
o	Object-Oriented Programming (OOP)
o	Classes & Objects
o	ArrayList 
•	IDE: IntelliJ IDEA / Eclipse / VS Code
•	Version Control: Git & GitHub
________________________________________
Features
•	Add vehicles to parking slots
•	Remove vehicles from parking
•	Track available and occupied slots
•	Efficient slot allocation
