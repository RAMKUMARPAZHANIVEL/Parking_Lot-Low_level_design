package com.parking_lot;

public class Vehicle {
		 private String vehicleNumber;
		 private String vehicleColor;
		 private ParkingSpot allocatedSpot;
		 
		 Vehicle(String registrationNum,String color){
			 this.vehicleNumber = registrationNum;
			 this.vehicleColor = color; 
		 }
		public String getVehicleNumber() {
			return vehicleNumber;
		}
		public void setVehicleNumber(String vehicleNum) {
			this.vehicleNumber = vehicleNum;
		}
		public String getVehicleColor() {
			return vehicleColor;
		}
		public void setVehicleColor(String vehicleColor) {
			this.vehicleColor = vehicleColor;
		}
		public ParkingSpot getAllocatedSpot() {
			return allocatedSpot;
		}
		public void setAllocatedSpot(ParkingSpot allocatedSpot) {
			this.allocatedSpot = allocatedSpot;
		}
		
		public boolean isparked() {
			if(this.allocatedSpot == null)
				return false;
			return true;
		}
 
 
 
}
