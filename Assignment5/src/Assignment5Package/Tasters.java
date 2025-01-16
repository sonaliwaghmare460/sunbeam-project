package Assignment5Package;

	import java.util.Scanner;

	public class Tasters {
	    public static void main(String[] args) {
	        AccountUtils utils = new AccountUtils();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\n1. Add Account\n2. Display an Account\n3. Display All Accounts\n4. Remove an Account");
	            System.out.println("5. Withdraw\n6. Deposit\n7. Transfer\n8. Search by Name\n9. Search by Email");
	            System.out.println("10. Search by Phone\n11. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            try {
	                switch (choice) {
	                    case 1 :{
	                        System.out.print("Enter account number: ");
	                        int accNo = scanner.nextInt();
	                        scanner.nextLine(); // consume newline
	                        System.out.print("Enter name: ");
	                        String name = scanner.nextLine();
	                        System.out.print("Enter email: ");
	                        String email = scanner.nextLine();
	                        System.out.print("Enter phone: ");
	                        String phone = scanner.nextLine();
	                        System.out.print("Enter balance: ");
	                        double balance = scanner.nextDouble();
	                        utils.addAccount(new Account(accNo, name, email, phone, balance));
	                    }
	                    case 2 : {
	                        System.out.print("Enter account number: ");
	                        int accNo = scanner.nextInt();
	                        System.out.println(utils.displayAccount(accNo));
	                    }
	                    case 3 :
	                    	utils.displayAllAccounts();
	                    case 4 : {
	                        System.out.print("Enter account number: ");
	                        int accNo = scanner.nextInt();
	                        utils.removeAccount(accNo);
	                    }
	                    case 5 :
	                    {
	                        System.out.print("Enter account number: ");
	                        int accNo = scanner.nextInt();
	                        System.out.print("Enter amount to withdraw: ");
	                        double amount = scanner.nextDouble();
	                        utils.withdraw(accNo, amount);
	                    }
	                    case 6 : {
	                        System.out.print("Enter account number: ");
	                        int accNo = scanner.nextInt();
	                        System.out.print("Enter amount to deposit: ");
	                        double amount = scanner.nextDouble();
	                        utils.deposit(accNo, amount);
	                    }
	                    case 7 :
	                    {
	                        System.out.print("Enter sender account number: ");
	                        int fromAcc = scanner.nextInt();
	                        System.out.print("Enter receiver account number: ");
	                        int toAcc = scanner.nextInt();
	                        System.out.print("Enter amount to transfer: ");
	                        double amount = scanner.nextDouble();
	                        utils.transfer(fromAcc, toAcc, amount);
	                    }
	                    case 8 : {
	                        System.out.print("Enter name: ");
	                        scanner.nextLine(); // consume newline
	                        String name = scanner.nextLine();
	                        System.out.println(utils.searchByName(name));
	                    }
	                    case 9 : {
	                        System.out.print("Enter email: ");
	                        scanner.nextLine(); // consume newline
	                        String email = scanner.nextLine();
	                        System.out.println(utils.searchByEmail(email));
	                    }
	                    case 10 : {
	                        System.out.print("Enter phone: ");
	                        scanner.nextLine(); // consume newline
	                        String phone = scanner.nextLine();
	                        System.out.println(utils.searchByPhone(phone));
	                    }
	                    case 11 : {
	                        System.out.println("Exiting...");
	                        scanner.close();
	                        return;
	                    }
	                }
	            } catch (Exception e) {
	                System.out.println(e.getMessage());
	            }
	        }
	    }
	}
