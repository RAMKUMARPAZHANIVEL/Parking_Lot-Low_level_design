package com.parking_lot;

public class ParkingSpot {
	  private int spotNumber;
	  private boolean isOccupied;
	  private Vehicle vehicleHere;
	public ParkingSpot(int spotNum) {
		this.spotNumber = spotNum;
		this.isOccupied = false;
		System.out.println("parking spot is created at spot number_"+ this.spotNumber);
	}
	public int getSpotNumber() {
		return spotNumber;
	}
	
	public boolean isOccupied() {
		return isOccupied;
	}
	
	public Vehicle getVehicleHere() {
		return vehicleHere;
	}
	
	public void setOccupancy(boolean value,Vehicle vehicle) {
		this.vehicleHere = vehicle;
		this.isOccupied = value;
	}
  
  
}
