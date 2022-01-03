package practical3;
import java.util.Scanner;

class Customer{
	private String customerName;
	private int customerAge;
	
	//getters and setters for customer name
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	//getters and setters for customer age
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	
}

abstract class Account{
	protected double balance;
	protected int accountId;
	protected String accountType;
	protected Customer custobj;
	
	//getters and setters for balance
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//getters and setters for account id
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	
	//getters and setters for account type
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	//getters and setters for customer object
	public Customer getCustobj() {
		return custobj;
	}
	public void setCustobj(Customer custobj) {
		this.custobj = custobj;
	}
	//abstract method withdraw
	public abstract boolean withdraw(double amount);
}

class SavingsAccount extends Account{
	private double minimumBalance;

	//getters and setters for minimum balance
	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	
	public boolean withdraw(double amount) {
		//method to return true or false
		if((balance - amount) > minimumBalance) {
			//checking if balance after withdrawal greater than minimum balance
			balance = balance - amount;
			return true;
		}
		else
			return false;
	}
}

class Bank{
	public static Scanner sc = new Scanner(System.in);
	public SavingsAccount a = new SavingsAccount();
	public Customer c = new Customer();
	
	//method to create an account
	public SavingsAccount createAccount() {
		sc.nextLine();
		
		System.out.print("Enter your name: ");
		String customername = sc.nextLine();
		c.setCustomerName(customername);
		
		System.out.print("Enter your age: ");
		int customerage = sc.nextInt();
		if(customerage < 18) {
			do {
				System.out.print("Minimum age should be 18 to create Account.\nPlease enter valid age: ");
				customerage = sc.nextInt();
			}while(customerage < 18);
		}
		c.setCustomerAge(customerage);
		
		a.setCustobj(c);
		
		System.out.print("Enter your account Id: ");
		int accountid = sc.nextInt();
		a.setAccountId(accountid);
		
		System.out.print("Enter your account type: ");
		String accounttype = sc.next();
		a.setAccountType(accounttype);
		
		System.out.print("Enter balance: ");
		double balance = sc.nextDouble();
		a.setBalance(balance);
		
		System.out.print("Enter minimum balance: ");
		double minbalance = sc.nextDouble();
		a.setMinimumBalance(minbalance);
		
		return a; //returning saving account
	}
	
	//method to withdraw amount
	void getWithdrawAmount() {
		System.out.print("Enter the amount you want to withdraw: ");
		double amount = sc.nextDouble();
		
		//checking withdrawal limit
		if(amount > 25000) {
			System.out.println("Withdrawal failed. Max Withdrawal Limit: 25000");
		}
		else {
			if(a.withdraw(amount) == true) {
				System.out.println("Withdrawal successful. Balance is: "+a.getBalance());
			}
			else
				System.out.println("Not Enough balance!!!");
		}
	}
	
	//method to deposit amount
	public void depositAmount(double amount) {
		double bal = a.getBalance() + amount;
		a.setBalance(bal);
		System.out.println("Balance is: "+a.getBalance());
	}
	
	//method to check Balance
	public void checkBalance() {
		System.out.println("Balance is: "+a.getBalance());
	}
	
	//method to display Account Information
	public void displayAccountInformation() {
		System.out.println("Welcome "+c.getCustomerName()+"! Following are your account details:");
		System.out.println("Age: "+c.getCustomerAge());
		System.out.println("Account Id: "+a.getAccountId());
		System.out.println("Account Type: "+a.getAccountType());
		System.out.println("Balance: "+a.getBalance());
		System.out.println("Minimum balance: "+a.getMinimumBalance());
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SavingsAccount a;
		Bank bm = new Bank();
		
		do {
			System.out.println("\n\t1.Create Account\n\t2.Display Account\n\t3.Check Balance\n\t4.Deposit Amount\n\t5.Withdraw Amount\n\t6.Exit");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			System.out.println("");
			switch(choice) {
			
			case 1:
				a = bm.createAccount();
				System.out.println("=====================================================");
				break;
				
			case 2:
				bm.displayAccountInformation();
				System.out.println("======================================================");
				break;
				
			case 3:
				bm.checkBalance();
				System.out.println("=======================================================");
				break;
				
			case 4:
				System.out.print("Enter the amount you want to deposit: ");
				double amount = sc.nextDouble();
				bm.depositAmount(amount);
				System.out.println("========================================================");
				break;
				
			case 5:
				bm.getWithdrawAmount();
				System.out.println("========================================================");
				break;
				
			case 6:
				System.out.println("========================================================");
				return ; //stop execution of program
				
			default:
				System.out.println("Invalid option");
				System.out.println("========================================================");
				break;
			}
		}while(true);
	}
}
