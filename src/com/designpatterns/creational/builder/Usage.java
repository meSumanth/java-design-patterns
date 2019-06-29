package com.designpatterns.creational.builder;

/**
 * @author Sumanth
 *
 */
public class Usage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BankAccount bankAccount = new BankAccount
				.BankAccountBuilder("Sumanth", "1223435465784534")
				.withEmail("test@gmail.com")
				.wantNewsLetter(true)
				.build();

		System.out.println("Account details are: " + bankAccount);
	}

}
