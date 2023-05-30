package application;

import java.util.Locale;
import java.util.Scanner;

import models.entities.Account;
import models.exeptions.WhithdrawExeption;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.println("Number: ");
		int number = scanner.nextInt();
		
		System.out.println("Holder: ");
		scanner.nextLine();
		String name = scanner.nextLine();
		
		System.out.println("Initial balance: ");
		double initialBalance = scanner.nextDouble();
		
		System.out.println("Whithdraw limit: ");
		double limit = scanner.nextDouble();
		
		Account account = new Account(number, name, initialBalance, limit);
		
		System.out.println("Enter amount for withdraw: ");
		double whithdraw = scanner.nextDouble();
		
		try {
			account.whithDraw(whithdraw);
		} catch (WhithdrawExeption e) {
			System.out.println("Whithdraw error: " + e.getMessage());
		}
		
		scanner.close();
	}

}
