package PayMoney_Application;

public class checkTarget 
{
	
	public static void checkTargetAchieved(int targetSize, int target, int transactionSize, int transactions[])
	{
		boolean isTargetAchieved=false;
		int sum = 0;
		for(int i=0;i<transactionSize;i++)
		{
			sum+=transactions[i];
			if(sum>=target)
			{
				isTargetAchieved = true;
				System.out.println("Target achieved after "+ (i+1) + " transactions.");
				break;
			}
		}
		if(isTargetAchieved==false) System.out.println("Given target is not achieved");
	}
}

