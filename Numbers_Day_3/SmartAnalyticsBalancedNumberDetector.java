import java.util.Scanner;
class SmartAnalyticsBalancedNumberDetector
{
	public static void BalancedNumber(int No)
	{
		int Back_Sum = 0;
		int Front_Sum =0;
		int iCount = 0;
		int temp = No;
		int iDigit = 0;
		
		
		while(temp > 0)
		{
			
			iCount++;
			temp  = temp/10;
		}
		if(iCount == 1)
		{
			System.out.println("Unbalanced Number");
			
		}
		for(int i = 0;i < iCount/2;i++)
		{
			Back_Sum += No%10;
			No = No /10;
		}
		if(iCount % 2 != 0)
		{
			No = No /10;
		}
		while(No > 0)
		{
			Front_Sum += No%10;
			No = No/10;
		}
		if(Back_Sum == Front_Sum)
		{
			System.out.println("Balance Number");
		}
		else
		{
			System.out.println("Unbalance Number");
		}
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter they first number:");
		int No = sobj.nextInt();
		BalancedNumber(No);
	}

}
