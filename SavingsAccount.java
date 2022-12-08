
public class SavingsAccount {
	static double air;
    double savingsbalance;
	 double total=0;
	double monthlyInterest()
	{
	   total=(savingsbalance*air)/12;
	   total=savingsbalance+total;
	   return total;
	}
	void mir(double i)
	{
		air=i;
	}
}
