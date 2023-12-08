package com.oops;

public abstract class Theatre {
	
	/*
	 * 1. Screen size 
	 * 2. No of Seats 
	 * 3. Parking 
	 * 4. Sound system 
	 * 5. Online Booking Facility 
	 * 6. Washrooms 
	 * 7. Canteen 
	 * 8. Ticket validation 
	 * 9. Fire and Safety 
	 * 10.Ticket counter
	 */
	
	// Concrete java method
	public void onlineBookingFacility() {
		// implementation
		System.out.println("Good to have Online Booking Facility..!");
	}
		
	// abstract or method without body or method definition
	public abstract void noofSeats();
	public abstract void screenSize();
	public abstract void parking();
	public abstract void soundSystem();
	public abstract void washrooms();
	public abstract void canteen();
	public abstract void ticketValidation();
	public abstract void fireAndSecurity();
	public abstract void ticketCounter();
	
	
	public static void main(String[] args) {
		

	}

}
