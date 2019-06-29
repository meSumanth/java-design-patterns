package com.designpatterns.creational.builder;

/**
 * @author Sumanth
 *
 */
public class BankAccount {

	private String name;

	private String accountNumber;

	private String email;

	private boolean newsLetter;

	private BankAccount(BankAccountBuilder bankBuilder) {
		this.name = bankBuilder.name;
		this.accountNumber = bankBuilder.accountNumber;
		this.email = bankBuilder.email;
		this.newsLetter = bankBuilder.newsLetter;
	}

	public static class BankAccountBuilder {
		private String name;

		private String accountNumber;

		private String email;

		private boolean newsLetter;

		public BankAccountBuilder(String name, String accountNumber) {
			this.name = name;
			this.accountNumber = accountNumber;
		}

		public BankAccountBuilder withEmail(String email) {
			this.email = email;
			return this;
		}

		public BankAccountBuilder wantNewsLetter(boolean newsLetter) {
			this.newsLetter = newsLetter;
			return this;
		}

		public BankAccount build() {
			return new BankAccount(this);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isNewsLetter() {
		return newsLetter;
	}

	public void setNewsLetter(boolean newsLetter) {
		this.newsLetter = newsLetter;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BankAccount [name=");
		builder.append(name);
		builder.append(", accountNumber=");
		builder.append(accountNumber);
		builder.append(", email=");
		builder.append(email);
		builder.append(", newsLetter=");
		builder.append(newsLetter);
		builder.append("]");
		return builder.toString();
	}

}
