package Assignment5Package;
	//import java.io.Serializable;
	import java.io.*;
	import java.util.*;

	public class Account implements Serializable {
		int accountNumber;
		String name;
		String email;
		String Phone;
		double balance;
		
		public Account(int accountNumber, String name, String email,  String Phone, double balance)
		{
			this.accountNumber = accountNumber;
			this.name = name;
			this.email = email;
			this.Phone = Phone;
			this.balance = balance;
		}

		public int getAccountNumber() {
			return accountNumber;
		}

		public String getName() {
			return name;
		}

		public String getEmail() {
			return email;
		}

		public String getPhone() {
			return Phone;
		}

		public double getBalance() {
			return balance;
		}
		

		public void setBalance(double balance) {
			this.balance = balance;
		}

		@Override
		public String toString() {
			return  "accountNumber=" + accountNumber + ", name=" + name + ", email=" + email + ", Phone=" + Phone
					+ ", balance=" + balance  ;
		}
		
			
		}
	class InvalidAccountException extends Exception {
	    public InvalidAccountException(String message) {
	        super(message);
	    }
	}

	class AccountNotFoundException extends Exception {
	    public AccountNotFoundException(String message) {
	        super(message);
	    }
	}

	class InsufficientBalanceException extends Exception {
	    public InsufficientBalanceException(String message) {
	        super(message);
	    }
	}
	 interface Operations {
	    void addAccount(Account account) throws InvalidAccountException;
	    Account displayAccount(int accountNumber) throws AccountNotFoundException;
	    void displayAllAccounts();
	    void removeAccount(int accountNumber) throws AccountNotFoundException;
	    void withdraw(int accountNumber, double amount) throws AccountNotFoundException, InsufficientBalanceException;
	    void deposit(int accountNumber, double amount) throws AccountNotFoundException;
	    void transfer(int fromAccount, int toAccount, double amount) throws AccountNotFoundException, InsufficientBalanceException;
	    List<Account> searchByName(String name);
	    Account searchByEmail(String email);
	    Account searchByPhone(String phone);
	}


