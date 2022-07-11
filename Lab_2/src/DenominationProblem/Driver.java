package DenominationProblem;

import java.util.Arrays;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) 
	{
		int denominationSize, denominations[], targetAmount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		denominationSize = sc.nextInt();
		denominations = new int[denominationSize];
		System.out.println("Enter the currency denominations value");
		for(int i=0;i<denominationSize;i++)	denominations[i] = sc.nextInt();
		Arrays.sort(denominations);
		DenominationSolution.ReverseArray(denominations);
		System.out.println("Enter the amount you want to pay");
		targetAmount = sc.nextInt();
		System.out.println("Your payment approach in order to give min no of notes will be");
		DenominationSolution.checkTarget(denominations, targetAmount);
		sc.close();
	}

}
