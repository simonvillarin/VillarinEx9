package org.ssglobal.training.codes.itemD;

public class LandVehicle extends Vehicle implements Hovercraft, Jeep {
	private int numWheels;

	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
	
	public void drive() {
		
	}

	@Override
	public void soundHorn() {
		
	}

	@Override
	public void enterLand() {
		
	}

	@Override
	public void enterSea() {
		
	}
}
