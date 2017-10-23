package moduleOne;

public class SavingsAccount {
	
	private String name = ""; //instanced name value
	private double balance; //balance for the instance of savings acct
	private static double allBal; //the total balance of all accounts
	
	
	public void deposit(double amount) { //add arg to existing balance
		balance += amount;
		allBal += amount; //update instanced and static balances
		//System.out.println("TAKYON");
		//hell yeah
	}
	
	public double withdraw(double amount) { //reduce balance by amount and return current balance
		balance -= amount;
		allBal -= amount; //same as above- update em both
		return balance;
	}
	public double getBalance() {
		return balance;
	}
	public static double getAllBal() {
		return allBal; //return the value of the total balance of all accounts
		//return balance; this would not function. Static methods can only access static variables-
		//they are unable to access instanced variables as the method is not tied to a specific
		//instance of the class- like a static variable, they are a single address associated with 
		//every instance of the class
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
