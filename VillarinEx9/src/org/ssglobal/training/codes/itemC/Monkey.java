package org.ssglobal.training.codes.itemC;

public class Monkey implements Mammal{
	
	@Override
	public boolean givesMilk() {
		return true;
	}

	@Override
	public String makeSound() {
		return "Screech";
	}

	@Override
	public boolean givesLiveBirth() {
		return true;
	}
}
