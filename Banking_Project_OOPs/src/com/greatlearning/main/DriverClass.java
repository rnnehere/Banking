package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Customer;
import com.greatlearning.service.Banking;

public class DriverClass {

	public static void main(String[] args) {

		
		Banking banking = new Banking();	

		Customer customer1 = new Customer("32390016", "password");
		// Customer customer2 = new Customer("32390017", "password2");

		Scanner sc = new Scanner(System.in);
		String bankAccountNo;
		String password;
		System.out.println("welcome to the login page");
		System.out.println();
		System.out.println("enter the bank Account no ");
		bankAccountNo = sc.nextLine();
		System.out.println("enter the password for the corresponding bank account no ");
		password = sc.nextLine();

		if (customer1.getBankAccountNo().equals(bankAccountNo) && customer1.getPassword().equals(password)) {
			System.out.println();
			System.out.println();
			System.out.println("!!!!! Welcome to Indian Bank !!!!!");
			int option;
			do {

				System.out.println();
				System.out.println("-----------------------------------------------");
				System.out.println("Enter the operation that you want to perform");
				System.out.println("1. Deposit");
				System.out.println("2. Withdrawl");
				System.out.println("3. Transfer");
				System.out.println("0. Logout");
				System.out.println("-----------------------------------------------");
				option = sc.nextInt();
				switch (option) {

				case 0:
					option = 0;
					break;
				case 1: {
					banking.deposit();

				}
				break;
				case 2: {
					banking.withdrawl();

				}
				break;
				case 3: {
					banking.transfer();

				}
				break;
				default:
					System.out.println("enter valid option");
				}

			} while (option != 0);
			System.out.println("Exited successfully");
			sc.close();
		} else {
			System.out.println("Invalid credentials");
		}

	}

}
