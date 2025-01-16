package Assignment5Package;


	import java.util.ArrayList;
	import java.util.List;

	public class AccountUtils implements Operations {
	    private List<Account> accounts = new ArrayList<>();

	    @Override
	    public void addAccount(Account account) throws InvalidAccountException {
	        if (account.getName().length() <= 5) {
	            throw new InvalidAccountException("Name must be more than 5 characters.");
	        }
	        if (account.getBalance() < 100) {
	            throw new InvalidAccountException("Balance must be greater than 100.");
	        }
	        if (!account.getEmail().contains("@") || !account.getEmail().contains(".")) {
	            throw new InvalidAccountException("Email must contain @ and .");
	        }
	        if (account.getPhone().length() != 10) {
	            throw new InvalidAccountException("Phone number must be 10 digits.");
	        }
	        accounts.add(account);
	        System.out.println("Account added successfully!");
	    }

	    @Override
	    public Account displayAccount(int accountNumber) throws AccountNotFoundException {
	        for (Account account : accounts) {
	            if (account.getAccountNumber() == accountNumber) {
	                return account;
	            }
	        }
	        throw new AccountNotFoundException("Account not found.");
	    }

	    @Override
	    public void displayAllAccounts() {
	        if (accounts.isEmpty()) {
	            System.out.println("No accounts available.");
	        } else {
	            accounts.forEach(System.out::println);
	        }
	    }

	    @Override
	    public void removeAccount(int accountNumber) throws AccountNotFoundException {
	        Account account = displayAccount(accountNumber);
	        accounts.remove(account);
	        System.out.println("Account removed successfully.");
	    }

	    @Override
	    public void withdraw(int accountNumber, double amount) throws AccountNotFoundException, InsufficientBalanceException {
	        Account account = displayAccount(accountNumber);
	        if (account.getBalance() < amount) {
	            throw new InsufficientBalanceException("Insufficient balance.");
	        }
	        account.setBalance(account.getBalance() - amount);
	        System.out.println("Withdrawal successful. New balance: " + account.getBalance());
	    }

	    @Override
	    public void deposit(int accountNumber, double amount) throws AccountNotFoundException {
	        Account account = displayAccount(accountNumber);
	        account.setBalance(account.getBalance() + amount);
	        System.out.println("Deposit successful. New balance: " + account.getBalance());
	    }

	    @Override
	    public void transfer(int fromAccount, int toAccount, double amount) throws AccountNotFoundException, InsufficientBalanceException {
	        Account sender = displayAccount(fromAccount);
	        Account receiver = displayAccount(toAccount);
	        if (sender.getBalance() < amount) {
	            throw new InsufficientBalanceException("Insufficient balance.");
	        }
	        sender.setBalance(sender.getBalance() - amount);
	        receiver.setBalance(receiver.getBalance() + amount);
	        System.out.println("Transfer successful.");
	    }

	    @Override
	    public List<Account> searchByName(String name) {
	        List<Account> result = new ArrayList<>();
	        for (Account account : accounts) {
	            if (account.getName().equalsIgnoreCase(name)) {
	                result.add(account);
	            }
	        }
	        return result;
	    }

	    @Override
	    public Account searchByEmail(String email) {
	        for (Account account : accounts) {
	            if (account.getEmail().equalsIgnoreCase(email)) {
	                return account;
	            }
	        }
	        return null;
	    }

	    @Override
	    public Account searchByPhone(String phone) {
	        for (Account account : accounts) {
	            if (account.getPhone().equals(phone)) {
	                return account;
	            }
	        }
	        return null;
	    }
	}

