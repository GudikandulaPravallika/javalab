import java.util.Scanner;
public class TestElectricityBill {

	public static void main(String[] args) {
		//creating scanner object
		Scanner sc=new Scanner(System.in);
		//taking input for all instance variablesusing scanner function
		System.out.println("enter consumer number"+sc.nextInt());
		System.out.println("enter consumer name"+sc.next());
		System.out.println("enter previous month reading"+sc.nextDouble());
		System.out.println("enter current month reading"+sc.nextDouble());
		System.out.println("enter type of use"+sc.next());
		ElectricityBill e=new ElectricityBill();
		System.out.println("Bill is:"+e.amount());
	}
}
