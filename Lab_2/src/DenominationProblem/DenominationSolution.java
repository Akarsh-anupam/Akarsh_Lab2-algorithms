package DenominationProblem;

public class DenominationSolution 
{
	public static void PrintSolution(int denominations[], int counters[])
	{
		for(int i=0;i<denominations.length;i++)
		{
			if(counters[i]!= 0)
				System.out.println(denominations[i] + " : " + counters[i]);
		}
	}
	
	public static void ReverseArray(int myArray[])
	{
		for(int i =0; i<(myArray.length)/2; i++)
		{
			int temp = myArray[i];
			myArray[i] = myArray[myArray.length-i-1];
			myArray[myArray.length-i-1] = temp;
		}
	}
	
	public static void Print(int myArray[])
	{
		for(int i=0;i<myArray.length;i++) 
		{
			System.out.print(myArray[i] + " ");
		}
		System.out.println();
	}
	
	public static int MySolution(int denominations[], int targetAmount, int counts[])
	{
		
		for(int i=0;i<denominations.length;i++)
		{
			if(denominations[i] <= targetAmount)
			{
				counts[i] = targetAmount/denominations[i];
				targetAmount %= denominations[i];
			}
		}
		return targetAmount;
	}
	
	public static void checkTarget(int denominations[], int targetAmount)
	{
		int counts[]=null;
		for(int i=0;i<denominations.length;i++)
		{
			if(targetAmount==0) break;
			else
			{
				denominations = NewArray(denominations, i);
				counts = new int[denominations.length];
				targetAmount = MySolution(denominations, targetAmount, counts);
			}
			
		}
		PrintSolution(denominations, counts);
	}

	public static int[] NewArray(int denominations[], int index)
	{
		int myArray[] = new int[denominations.length-index];
		for(int i=0;i<myArray.length;i++)
		{
			myArray[i] = denominations[index + i];
		}
		return myArray;
	}

}
