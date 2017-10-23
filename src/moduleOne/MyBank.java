package moduleOne;

public class MyBank {

	public static void main(String[] args) {
		SavingsAccount s1 = new SavingsAccount();
		s1.deposit(150);
		System.out.println("After withdrawing $50, balance is $"+s1.withdraw(50)+".");
		SavingsAccount s2 = new SavingsAccount();
		s2.deposit(500);
		System.out.println("After withdrawing $200, balance is $"+s2.withdraw(200)+".");
		System.out.println("After all of that silliness, the sum total of all the money in all the accounts is $"+SavingsAccount.getAllBal()+".");
	}

}
