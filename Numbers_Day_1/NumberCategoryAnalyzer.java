import java.util.*;

class NumberCategoryAnalyzer
{
	public static int Cheaking(int No)
	{
		if(No <0)
		{
			return 1;
		}
		else if(No > 0)
		{
			return 2;
		}
		else
		{
			return 3;
		}
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter they number:");
		
		int No = sobj.nextInt();
		int iRet =Cheaking(No);
		if(iRet == 1)
		{
			System.out.println("Number is negative");
		}
		else if(iRet == 2)
		{
			System.out.println("Number is positive");
		}
		else
		{
			System.out.println("zero");
		}
		
		
	
	}
}
