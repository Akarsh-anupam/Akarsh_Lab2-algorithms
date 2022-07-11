package PayMoney_Application;
import java.util.Scanner;

public class PayMoney_Problem {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int targetSize, target, transactionSize, transactions[];
		System.out.println("Enter the size of transaction array: ");
		transactionSize = sc.nextInt();
		transactions = new int[transactionSize];
		System.out.println("Enter the values of array:");
		for(int i = 0; i<transactionSize;i++)
		{
			transactions[i] = sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved: ");
		targetSize = sc.nextInt();
		while(targetSize>0) 
		{
			System.out.println("Enter the value of the target");
			target = sc.nextInt();
			checkTarget.checkTargetAchieved(targetSize, target, transactionSize, transactions);
			--targetSize;
		}
		sc.close();
	}
}
