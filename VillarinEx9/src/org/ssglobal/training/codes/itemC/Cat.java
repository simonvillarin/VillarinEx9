package org.ssglobal.training.codes.itemC;

public class Cat implements Mammal{
	
	@Override
	public boolean givesMilk() {
		return true;
	}

	@Override
	public String makeSound() {
		return "Meow";
	}

	@Override
	public boolean givesLiveBirth() {
		return true;
	}
}
