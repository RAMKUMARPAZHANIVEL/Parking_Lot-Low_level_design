package com.parking_lot;

public class ParkingManager {
	 public static void main(String[] args) {
		  ParkingLot parking = new ParkingLot(10);
		  Vehicle v1 = new Vehicle("TN 49 bp 9147","black");
		  Vehicle v2 = new Vehicle("TN 81 bp 9147","black");
		  Vehicle v3 = new Vehicle("TN 81 Y 6494","white");
		  parking.bookParking(v1);
		  parking.bookParking(v2);
		  parking.bookParking(v3);

    	  parking.checkout(v2);  

		  

	 }
	
}
