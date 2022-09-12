package com.parking_lot;

import java.util.*;

public class ParkingLot {
    private int maxCapacity;
    private int totalVehicles;
    private ArrayList<ParkingSpot> spots;
    private PriorityQueue<ParkingSpot> availableSpots;
	
    public ParkingLot(int Capacity) {
	 this.maxCapacity = Capacity;
	 this.totalVehicles = 0;
	 this.spots = new ArrayList<>();
	 this.availableSpots = new PriorityQueue<>(new Comparator<ParkingSpot>() {
		 @Override
		 public int compare(ParkingSpot p1,ParkingSpot p2) {
			 return Integer.compare(p1.getSpotNumber(),p2.getSpotNumber());
		 }
	 });
	 for(int i=0; i<maxCapacity; i++) {
		 ParkingSpot newSpot = new ParkingSpot(i+1);
		 this.spots.add(newSpot);
		 this.availableSpots.add(newSpot);
	   }
	}
    
   public boolean bookParking(Vehicle vehicle ) {
	   if(totalVehicles == maxCapacity) {
		   System.out.println("Parking is full!.Booking failed");
    	   return false;
	   }
	   
		   ParkingSpot newSpot = availableSpots.poll();
		   vehicle.setAllocatedSpot(newSpot);
		   newSpot.setOccupancy(true, vehicle);
		   this.totalVehicles++;
		   System.out.println("The vehicle with registation number "+vehicle.getVehicleNumber()+ " is parked at spot number_"+ newSpot.getSpotNumber());
	   
	   return true;
   }
   public void checkout(Vehicle v) {
	   if(v.isparked()) {
		   ParkingSpot parkedSpot = v.getAllocatedSpot();
		   availableSpots.add(parkedSpot);
		   v.setAllocatedSpot(null);
		   totalVehicles--;
		   System.out.println(v.getVehicleNumber()+ " is unparked from the parking spot_"+ parkedSpot.getSpotNumber());
	   }
	   else {
		   System.out.println("vehicle is not parked at that spot!");
	   }
   }
    
}
