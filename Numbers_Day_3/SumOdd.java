import java.util.*;

class SumOdd
{
	public static int SumOdd(int No)
	{
		int Digit = 0;
		int SumOdd = 1;
		boolean bFlag = false;
		
		while(No > 0)
		{
			Digit = (No %10);
			if(Digit % 2 != 0)
			{
				SumOdd *= Digit;
			}
			No = No/10;
			
		}
		while(No < 0)
		{
			Digit = -(No %10);
			if(Digit % 2 != 0)
			{
				SumOdd *= Digit;
				bFlag = true;
			}
			No = No/10;
			
		}
		if(bFlag == true)
		{
			return SumOdd;
		}
		else
		{
			return 0;
		}
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter they number:");
		int No = sobj.nextInt();
		
		int iRet = SumOdd(No);
		
		System.out.println("The Summation will be:"+iRet);
		
		
		
		
		
	}
}
