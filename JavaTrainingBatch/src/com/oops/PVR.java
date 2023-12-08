package com.oops;

public class PVR extends Theatre {

	public void noofSeats() {
	   System.out.println("No of seats are 300 out of which 40 Recliner, 160 First Class, 100 Second Class");
	}
	
	public static void main(String[] args) {
		PVR p = new PVR();
		p.noofSeats();
		p.screenSize();
		p.parking();
		p.soundSystem();
		p.washrooms();
		p.canteen();
		p.ticketCounter();
		p.fireAndSecurity();
		p.ticketValidation();
		p.onlineBookingFacility();
	}

	
	public void screenSize() {
		System.out.println("Screen size is 70mm");
	}

	
	public void parking() {
		System.out.println("Parking facility is provided to park 100 cars and 500 bikes");
	}

	
	public void soundSystem() {
		System.out.println("Dolby digital sound sytsem with 500 decibels is available");
	}

	
	public void washrooms() {
		System.out.println("Washroom facility is available for men and women");
	}

	
	public void canteen() {
		System.out.println("Canteen facility is available");
	}

	
	public void ticketValidation() {
		System.out.println("Ticket validation will be done at the entrance");
	}

	
	public void fireAndSecurity() {
		System.out.println("FireAndSecurity precautions were take care");
	}

	
	public void ticketCounter() {
		System.out.println("TicketCounter facility is available");
	}


}
