package com.oops;

public class PVR extends Theatre {

	public void noofSeats() {
	   System.out.println("No of seats are 300 out of which 40 Recliner, 160 First Class, 100 Second Class");
	}
	
	public static void main(String[] args) {
		PVR p = new PVR();
		p.noofSeats();

	}


}
