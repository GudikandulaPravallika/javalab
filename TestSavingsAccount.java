
public class TestSavingsAccount {

	public static void main(String[] args) {
		SavingsAccount saver1=new SavingsAccount();
		SavingsAccount saver2=new SavingsAccount();
		saver1.savingsbalance=2000.00;
		saver2.savingsbalance=3000.00;
		saver1.mir(4);
		saver2.mir(4);
		System.out.println("SavingsBalance of first saver is"+saver1.monthlyInterest());
		System.out.println("SavingsBalance of second saver is"+saver2.monthlyInterest());
		saver1.mir(5);
		saver2.mir(5);
		System.out.println("SavingsBalance of first saver is"+saver1.monthlyInterest());
		System.out.println("SavingsBalance of second saver is"+saver2.monthlyInterest());
		
		
		

	}

}
