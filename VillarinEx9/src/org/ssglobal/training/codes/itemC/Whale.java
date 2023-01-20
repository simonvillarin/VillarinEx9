package org.ssglobal.training.codes.itemC;

public class Whale implements Mammal{

	@Override
	public boolean givesMilk() {
		return true;
	}

	@Override
	public String makeSound() {
		return "[whale song]";
	}

	@Override
	public boolean givesLiveBirth() {
		return true;
	}
}
