package org.ssglobal.training.codes.itemB;

public class SavingsAccount {
	private static double annualInterestRate;
	private double savingsBalance;
	
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public double calculateMonthlyInterest() {
		double interest = (savingsBalance * annualInterestRate) / 12;
		savingsBalance += interest;
		return interest;
	}

	public static void modifyInterestRate(double newRate) {
		annualInterestRate = newRate;
	}
}
