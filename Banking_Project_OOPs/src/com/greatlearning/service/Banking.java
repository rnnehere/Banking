package com.greatlearning.service;

import java.util.Scanner;

public class Banking {

	Scanner sc = new Scanner(System.in);
	OTPGenerator otpG = new OTPGenerator();
	int bankBalance = 1000;

	public void deposit() {

		int amount;
		System.out.println("enter the amount you want to deposit");
		amount = sc.nextInt();
		if (amount > 0) {
			System.out.println("amount " + amount + " deposit successfully");
			bankBalance = bankBalance + amount;
			System.out.println("Remaining Bank balance is " + bankBalance);
		} else
			System.out.println("enter a correct amount");
	}

	public void withdrawl() {
		int amount;
		System.out.println("enter the amount you want to withdrawl");
		amount = sc.nextInt();
		if (bankBalance - amount >= 0) {
			System.out.println("amount " + amount + " withdrawl successfully");
			bankBalance = bankBalance - amount;
			System.out.println("Remaining Bank balance is " + bankBalance);
		} else
			System.out.println("insufficient funds");
	}

	public void transfer() {
		int amount;
		int otp;
		int otpGenerated;
		int bankAccountNo;
		System.out.println("Enter the otp");
		otpGenerated = otpG.generateOTP();
		System.out.println(otpGenerated);
		otp = sc.nextInt();
		if (otp == otpGenerated) {
			System.out.println("otp verification Successful !!!");
			System.out.println(" enter the amount and BankAccount no to which you want to transfer");
			amount = sc.nextInt();
			bankAccountNo = sc.nextInt();

			if (bankBalance - amount >= 0) {
				System.out.println("amount " + amount + " transferred successful to bankAccount " + bankAccountNo);
				bankBalance = bankBalance - amount;
				System.out.println("Remaining Bank balance is " + bankBalance);
			} else
				System.out.println("insufficient funds");

		} else
			System.out.println("invalid otp please try again");

	}
}