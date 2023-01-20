package org.ssglobal.training.codes.itemB;

public class TestSavingsAccount {

	public static void main(String[] args) {
		SavingsAccount saver1  = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();
		saver1.setSavingsBalance(2000);
		saver2.setSavingsBalance(3000);
		
		SavingsAccount.modifyInterestRate(0.04);
		
		saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Saver 1: New balance = $%.2f".formatted(saver1.getSavingsBalance()));
        System.out.println("Saver 2: New balance = $%.2f".formatted(saver2.getSavingsBalance()));

        SavingsAccount.modifyInterestRate(0.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Saver 1: New balance = $%.2f".formatted(saver1.getSavingsBalance()));
        System.out.println("Saver 2: New balance = $%.2f".formatted(saver2.getSavingsBalance()));

	}

}
